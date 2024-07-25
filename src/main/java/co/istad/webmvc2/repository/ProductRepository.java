package co.istad.webmvc2.repository;

import co.istad.webmvc2.model.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Repository
@RequiredArgsConstructor
public class ProductRepository {

    private final List<Product> dataProduct;

    //INSERT statement
    public void insert(Product product) {
        dataProduct.add(product);
    }

    //Select * from products
   /* public List<Product> select() {
        return dataProduct;
    }
    //   SELECT * FROM Product WHERE _name ILIKE AND status = _status
    public List<Product> search(String name, Boolean status) {
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
}*/
    public List<Product> search(String condition, BigDecimal price) {
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
}