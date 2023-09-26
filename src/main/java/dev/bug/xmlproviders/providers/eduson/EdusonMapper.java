package dev.bug.xmlproviders.providers.eduson;

import dev.bug.xmlproviders.providers.Course;
import dev.bug.xmlproviders.providers.eduson.models.Item;
import java.util.function.Function;

public class EdusonMapper implements Function<Item, Course> {

    @Override
    public Course apply(Item item) {
        return Course.builder()
            .name(item.getTitle())
            .url(item.getProductUrl())
            .price(Integer.parseInt(item.getFullPrice()))
            .duration("%s Месяц".formatted(item.getDurationMonths()))
            .coursePurpose("Профессия".equals(item.getLearningType()) ? "PROFESSION" : "SKILL")
            .description(item.getProductDescription())
            .build();
    }
}
