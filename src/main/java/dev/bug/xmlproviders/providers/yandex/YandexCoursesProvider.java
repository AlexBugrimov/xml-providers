package dev.bug.xmlproviders.providers.yandex;

import dev.bug.xmlproviders.providers.Course;
import dev.bug.xmlproviders.providers.CoursesProvider;
import dev.bug.xmlproviders.providers.yandex.models.Offer;
import dev.bug.xmlproviders.providers.yandex.models.YmlCatalog;
import java.util.List;
import java.util.function.Function;

public class YandexCoursesProvider extends CoursesProvider<YmlCatalog, Offer> {

    private static final YandexMapper DEFAULT_MAPPER = new YandexMapper();
    private static final String NAME = "yandex";

    public YandexCoursesProvider(Function<Offer, Course> mapper) {
        super(NAME, mapper, YmlCatalog.class);
    }

    public YandexCoursesProvider() {
        this(DEFAULT_MAPPER);
    }

    @Override
    protected List<Offer> getItems(YmlCatalog catalog) {
        return catalog.getShop().getOffers();
    }

}
