package org.example;

import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.FileOutputStream;

public class MainApp {
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext contex = new AnnotationConfigApplicationContext(AppConfig.class);
//        ApplicationContext contex2 = new AnnotationConfigApplicationContext(AppConfig.class);
//        ProductService productService = contex.getBean(ProductService.class);
//        System.out.println(productService.getTitleById(1L));
        Cart cart1 = contex.getBean(Cart.class);
        Cart cart2 = contex.getBean(Cart.class);

        cart1.add(1L);
        cart1.add(2L);

        cart2.add(3L);
        cart2.add(4L);
        cart2.add(5L);

        System.out.println(cart1 + "\n" +cart2);

        FileOutputStream fos = contex.getBean(FileOutputStream.class);
        fos.write("qwe".getBytes());


    }
}
