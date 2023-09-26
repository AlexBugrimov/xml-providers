package dev.bug.xmlproviders.providers.eduson;

import dev.bug.xmlproviders.providers.Course;
import dev.bug.xmlproviders.providers.CoursesProvider;
import dev.bug.xmlproviders.providers.eduson.models.Item;
import dev.bug.xmlproviders.providers.eduson.models.Rss;
import java.util.List;
import java.util.function.Function;

public class EdusonCoursesProvider extends CoursesProvider<Rss, Item> {

    public EdusonCoursesProvider(Function<Item, Course> mapper) {
        super("eduson", mapper, Rss.class);
    }

    public EdusonCoursesProvider() {
        this(new EdusonMapper());
    }

    @Override
    protected List<Item> getItems(Rss catalog) {
        return catalog.getChannel().getItems();
    }
}
