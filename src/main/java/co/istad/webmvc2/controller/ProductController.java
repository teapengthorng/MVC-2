package co.istad.webmvc2.controller;

import co.istad.webmvc2.model.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    private final List<Product> dataProducts;

    //Mapping URL: /product
    //TODO: View product list
//    http://localhost:8080/product
    @GetMapping
    String viewProduct(Model model) {
        model.addAttribute("dataProducts", dataProducts);
        return "product/product-list";
    }

    //TODO: View product ID Detail
//    http://localhost:8080/product/1/details

    @GetMapping("/{productID}/details")
    String viewProductDetail(@PathVariable Integer productID, Model model) {
        Product product = dataProducts
                .stream()
                .filter(p -> p.getId() == productID)
                .findFirst()
                .orElse(null);
        model.addAttribute("product", product);
        return "product/product-detail";
    }

    //TODO: View product Code
//    http://localhost:8080/product/P001/detail
    @GetMapping("/{productCode}/detail")
    String viewProductCode(@PathVariable String productCode, Model model) {
        Product product = dataProducts
                .stream()
                .filter(p -> p.getCode().equals(productCode)) // Assuming Product has a getCode() method
                .findFirst()
                .orElse(null);
        model.addAttribute("product", product);
        return "product/product-code";
    }
}
