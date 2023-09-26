package dev.bug.xmlproviders.providers;

import lombok.Builder;

@Builder
public record Course(
    String name,
    String url,
    Integer price,
    Integer pricePerMonth,
    String duration,
    String coursePurpose,
    String grade,
    String description
) {
}
