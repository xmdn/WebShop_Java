package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.APRIL;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mariam = new Student (
                    "Mariam",
                    "mara@gmail.com",
                    LocalDate.of(2000, APRIL, 5)

            );
            Student alex = new Student (
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
