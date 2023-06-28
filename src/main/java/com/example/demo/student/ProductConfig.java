package com.example.demo.student;

import com.example.demo.student.Entities.Product;
import com.example.demo.student.Interfaces.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.APRIL;

@Configuration
public class ProductConfig {
    @Bean
    CommandLineRunner comandLineRunner(ProductRepository repository) {
        return args -> {
            Product mariam = new Product (
                    "Mariam",
                    "mara@gmail.com",
                    LocalDate.of(2000, APRIL, 5)

            );
            Product alex = new Product(
                    "Alex",
                    "almara@gmail.com",
                    LocalDate.of(2002, APRIL, 5)

            );
            repository.saveAll(
                    List.of(mariam, alex)
            );
        };
    }
}
