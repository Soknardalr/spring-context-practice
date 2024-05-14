package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component(value = "repo")
@Primary
public class InMemoryRepository implements Repository {
    private List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    @PostConstruct
    public void init(){
        products = new ArrayList<>(Arrays.asList(
                new Product(1, "Bread", 50),
                new Product(2, "Milk", 80),
                new Product(3, "Juice", 150),
                new Product(4, "Chocolate", 150),
                new Product(5, "Vodka", 400)
        ));
    }
   @Override
   public Product findById(Long id){
        return products.stream().filter(p -> p.getId().equals(id)).findFirst().orElseThrow();
    }
}
