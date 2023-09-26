package dev.bug.xmlproviders.providers.yandex;

import dev.bug.xmlproviders.providers.Course;
import dev.bug.xmlproviders.providers.yandex.models.Offer;
import java.util.function.Function;

public class YandexMapper implements Function<Offer, Course> {

    @Override
    public Course apply(Offer offer) {
        var params = offer.getParamMap();

        // TODO Возможно это имеет смысл изменить
        var monthlyPrice =
            params.containsKey("Ежемесячная цена")
                ? Integer.parseInt(params.get("Ежемесячная цена").getValue())
                : 0;
        var duration = params.containsKey("Продолжительность")
            ? "%s %s".formatted(
            params.get("Продолжительность").getValue(),
            params.get("Продолжительность").getUnit())
            : "";
        var coursePurpose = params.containsKey("Тип обучения") &&
            "Профессия".equals(params.get("Тип обучения").getValue())
            ? "PROFESSION"
            : "SKILL";
        var grade = params.containsKey("Сложность") &&
            "Для новичков".equals(params.get("Сложность").getValue())
            ? "JUNIOR"
            : "MIDDLE";
        return Course.builder()
            .name(offer.getName())
            .url(offer.getUrl())
            .price(offer.getPrice())
            .pricePerMonth(monthlyPrice)
            .duration(duration)
            .coursePurpose(coursePurpose)
            .grade(grade)
            .description(offer.getDescription())
            .build();
    }
}
