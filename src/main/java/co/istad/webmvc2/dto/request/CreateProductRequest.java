package co.istad.webmvc2.dto.request;

import java.math.BigDecimal;

public record CreateProductRequest(
        String code,
        String name

) {
}
