package co.istad.webmvc2.service;

import co.istad.webmvc2.dto.response.ProductResponse;

import java.math.BigDecimal;
import java.util.List;

public interface ProductService {
//    List<ProductResponse> searchProductByName(String name, Boolean status);


    List<ProductResponse> searchProductByprice(String condition, BigDecimal price);
}
