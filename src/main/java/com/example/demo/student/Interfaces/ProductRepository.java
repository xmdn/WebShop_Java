package com.example.demo.student.Interfaces;

import com.example.demo.student.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query("SELECT s FROM Product s WHERE s.email = ?1")
    Optional<Product> findProductByEmail(String email);
    @Query("SELECT s FROM Product s WHERE s.name = ?1")
    Optional<Product> findProductByName(String name);
}
