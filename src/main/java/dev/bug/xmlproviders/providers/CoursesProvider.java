package dev.bug.xmlproviders.providers;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.List;
import java.util.function.Function;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.UrlResource;

@Slf4j
public abstract class CoursesProvider<S, T> {

    @Getter
    private final String name;

    private final Function<T, Course> mapper;

    private final Class<S> modelType;

    protected CoursesProvider(String name,
                              Function<T, Course> mapper,
                              Class<S> modelType) {
        this.name = name;
        this.mapper = mapper;
        this.modelType = modelType;
    }

    public List<Course> loadCourses(String url) {
        try (var inputStream = new UrlResource(url).getInputStream()) {
            var jaxbContext = JAXBContext.newInstance(modelType);
            var jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            var catalog = modelType.cast(jaxbUnmarshaller.unmarshal(inputStream)) ;
            return getItems(catalog)
                .stream()
                .map(mapper)
                .toList();
        } catch (IOException ex) {
            log.error("An error occurred while loading the resource", ex);
            throw new UncheckedIOException("Resource loading error [%s]".formatted(url), ex);
        } catch (JAXBException ex) {
            log.error("An error occurred during xml conversion", ex);
            throw new RuntimeException("XML processing error", ex);
        }
    }

    protected abstract List<T> getItems(S catalog);
}
