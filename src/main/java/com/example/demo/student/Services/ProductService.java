package com.example.demo.student.Services;

import com.example.demo.student.Entities.Product;
import com.example.demo.student.Interfaces.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public List<Product> getProducts() {
        return productRepository.findAll();
    }
    public void addNewProduct(Product product) {
        Optional<Product> productOptional = productRepository
                .findProductByEmail(product.getEmail());
        if(productOptional.isPresent()) {
            throw new IllegalStateException("email taken");
        }
        productRepository.save(product);
    }
}
