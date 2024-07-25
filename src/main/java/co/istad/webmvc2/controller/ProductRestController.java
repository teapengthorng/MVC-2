package co.istad.webmvc2.controller;


import co.istad.webmvc2.dto.response.ProductResponse;
import co.istad.webmvc2.model.Product;

import co.istad.webmvc2.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductRestController {


    // ?name={}
    //http://localhost:8080/api/products?name=ll
//    private final List<Product> dataProduct;
//    @GetMapping
//    List<Product> searchProductByName(@RequestParam String name) {
//        return dataProduct.stream()
//                .filter(product -> product.getName().toLowerCase().contains(name.toLowerCase()))
//                .toList();
//    }}

    // ?paramName=paramValue&paramName2=paramValue2
     /*   private final List<Product> dataProduct;
    @GetMapping
    List<Product> searchProductByName(@RequestParam(required = false, defaultValue = "") String name,
                                      @RequestParam(required = false) Boolean status
    ) {
        return dataProduct.stream()
                .filter(product -> {
                    if (status == null) {
                        return searchCondition(product, name);
                    } else {
                        return searchCondition(product, name);
                    }
                })
                .toList();
    }

    private boolean searchCondition(Product product, String name, Boolean status) {
        return product.getName().toLowerCase().contains(name.toLowerCase()) &&
                product.getStatus().equals(status);
    }

    private boolean searchCondition(Product product, String name) {
        return product.getName().toLowerCase().contains(name.toLowerCase());
    }

    private final List<Product> dataProduct;

    public ProductController(List<Product> dataProduct) {
        this.dataProduct = dataProduct;
    }

}*/

    // ?paramName=paramValue&paramName2=paramValue2
    //http://localhost:8080/api/products?name=ll&status=true
/*    private final ProductService productService;

    @GetMapping
    List<ProductResponse> searchProductByName(@RequestParam(required = false, defaultValue = "") String name,
                                              @RequestParam(required = false) Boolean status
    ) {
        return productService.searchProductByName(name, status);
    }
}*/

  /*  //TODO code
//    http://localhost:8080/api/products?code=P001
    private final List<Product> dataProduct;
    @GetMapping
    List<Product> searchProductByCode(@RequestParam String code) {
        return dataProduct.stream()
                .filter(product -> product.getCode().toLowerCase().contains(code.toLowerCase()))
                .toList();
    }
}*/

 /*   //TODO ID
    //http://localhost:8080/api/products?ID=4
    private final List<Product> dataProduct;
    @GetMapping
    List<Product> searchProductByCode(@RequestParam String ID) {
        return dataProduct.stream()
                .filter(product -> product.getId().toString().contains(ID.toLowerCase()))
                .toList();
    }
}*/

   /* //TODO price
    //RequestParam
    //Find by price (small, bigger, euql)
//    http://localhost:8080/api/products?price=100&condition=greater
    private final List<Product> dataProduct;

    @GetMapping
    List<Product> searchProductByPrice(
            @RequestParam BigDecimal price,
            @RequestParam String condition) {

        return dataProduct.stream()
                .filter(product -> {
                    switch (condition.toLowerCase()) {
                        case "equal":
                            return product.getPrice().compareTo(price) == 0;
                        case "greater":
                            return product.getPrice().compareTo(price) > 0;
                        case "less":
                            return product.getPrice().compareTo(price) < 0;
                        default:
                            throw new IllegalArgumentException("Invalid condition: " + condition);
                    }
                })
                .collect(Collectors.toList());
    }
}*/

    //TODO price
    //RequestParam
    //Find by price (small, bigger, euql)
//   http://localhost:8080/api/products?price=600&condition=less
    private final List<Product> dataProduct;
    private final ProductService productService;
    @GetMapping
    public List<ProductResponse> searchProductByPrice(
            @RequestParam BigDecimal price,
            @RequestParam String condition) {
        return productService.searchProductByprice(condition, price);
    }
}







