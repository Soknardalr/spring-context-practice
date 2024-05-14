package org.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

@Configuration
@ComponentScan("org.example")
public class AppConfig {
    @Bean
    public FileOutputStream FOS() throws FileNotFoundException {
        return new FileOutputStream("1.txt");
    }
    @Bean
      public FileInputStream FIS() throws FileNotFoundException {
        return new FileInputStream("1.txt");
    }

}
