package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
public class Cart {
    private List<Product> products;
    private Repository repository;

    @PostConstruct
    private void init(){
        products = new ArrayList<>();
    }

    public Cart(Repository repository) {
        this.repository = repository;
    }



    public void add(Long id){
        products.add(repository.findById(id));
    }

    @Override
    public String toString() {
        return "Cart{" +
                "products=" + products +
                '}';
    }

    public void delete(Long id){
        products.removeIf(p -> p.getId().equals(id));
    }
}
