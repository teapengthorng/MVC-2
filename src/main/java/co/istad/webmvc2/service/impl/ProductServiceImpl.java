package co.istad.webmvc2.service.impl;

import co.istad.webmvc2.dto.response.ProductResponse;
import co.istad.webmvc2.repository.ProductRepository;
import co.istad.webmvc2.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public List<ProductResponse> searchProductByprice(String condition, BigDecimal price) {
        return productRepository
                .search(condition, price)
                .stream()
                .map(product -> new ProductResponse(
                        product.getCode(),
                        product.getName(),
                        product.getPrice()
                )).toList();
    }
}
   /* @Override
    public List<ProductResponse> searchProductByName(String name, Boolean status ) {
        return productRepository
                .search(name, status)
                .stream()
                .map(product -> new ProductResponse(
                        product.getCode(),
                        product.getName(),
                        product.getPrice()

                )).toList();
    }
}*/


