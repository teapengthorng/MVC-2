package co.istad.webmvc2.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
public class Product {
    private Integer id;
    private String  code;
    private String  name;
    private String  Description;
    private BigDecimal price;
    private Boolean status;
    private String ram;
    private String storage;
    private String image;
}
