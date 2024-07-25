package co.istad.webmvc2.database;

import co.istad.webmvc2.model.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Component
public class StaticDatabase {
//    http://localhost:8080/product
    @Bean
    List<Product> dataProduct(){
        Product product1 = new Product();
        product1.setId(1);
        product1.setCode("P001");
        product1.setName("Iphone");
        product1.setDescription("Product 1");
        product1.setPrice(BigDecimal.valueOf(100));
        product1.setStatus(false);
        product1.setRam("8GB");
        product1.setStorage("1T");
        product1.setImage("https://fdn2.gsmarena.com/vv/pics/apple/apple-iphone-13-pro-max-5.jpg");

        Product product2 = new Product();
        product2.setId(2);
        product2.setCode("P002");
        product2.setName("dell");
        product2.setDescription("Product 2");
        product2.setPrice(BigDecimal.valueOf(600));
        product2.setStatus(true);
        product2.setRam("16GB");
        product2.setStorage("2T");
        product2.setImage("https://fdn2.gsmarena.com/vv/pics/apple/apple-iphone-14-2.jpg");

        Product product3 = new Product();
        product3.setId(3);
        product3.setCode("P003");
        product3.setName("Product 3");
        product3.setDescription("Product 3");
        product3.setPrice(BigDecimal.valueOf(90));
        product3.setStatus(true);
        product3.setRam("64GB");
        product3.setStorage("10T");
        product3.setImage("https://fdn2.gsmarena.com/vv/pics/apple/apple-iphone-15-pro-max-1.jpg");

        Product product4 = new Product();
        product4.setId(4);
        product4.setCode("P004");
        product4.setName("Product 4");
        product4.setDescription("Product 4");
        product4.setPrice(BigDecimal.valueOf(90));
        product4.setStatus(true);
        product4.setRam("16GB");
        product4.setStorage("2T");
        product4.setImage("https://fdn2.gsmarena.com/vv/pics/apple/apple-iphone-15-pro-max-3.jpg");


        Product product5 = new Product();
        product5.setId(5);
        product5.setCode("P005");
        product5.setName("Product 5");
        product5.setDescription("Product 5");
        product5.setPrice(BigDecimal.valueOf(40));
        product5.setStatus(true);
        product5.setRam("32GB");
        product5.setStorage("3T");
        product5.setImage("https://fdn2.gsmarena.com/vv/pics/apple/apple-iphone-13-pro-max-01.jpg");

        return List.of(
                product1,
                product2,
                product3,
                product4,
                product5
        );
    }
}
