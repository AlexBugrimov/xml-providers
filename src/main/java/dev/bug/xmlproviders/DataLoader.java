package dev.bug.xmlproviders;

import dev.bug.xmlproviders.providers.eduson.EdusonCoursesProvider;
import dev.bug.xmlproviders.providers.yandex.YandexCoursesProvider;
import java.util.List;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class DataLoader implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {
        var providersInfo = Map.of(
            "yandex", "https://practicum.yandex.ru/education.xml",
            "eduson", "https://stats-exporter.srv1.testla.app/amo/product-feed-active");

        var providers = List.of(
            new YandexCoursesProvider(),
            new EdusonCoursesProvider()
        );

        providers.forEach(coursesProvider -> {
                log.info("=====================> Start loading: {}", coursesProvider.getName());
                var url = providersInfo.get(coursesProvider.getName());
                var courses = coursesProvider.loadCourses(url);
                log.info("Data: {}", courses);
                log.info("Finish loading {} <=====================", coursesProvider.getName());
            }
        );
    }
}
