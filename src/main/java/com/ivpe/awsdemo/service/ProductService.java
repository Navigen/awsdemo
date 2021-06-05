package com.ivpe.awsdemo.service;

import com.ivpe.awsdemo.model.Product;
import com.ivpe.awsdemo.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getById(long id) {
        return productRepository.findById(id);
    }

    public Product add(Product product) {
        return productRepository.save(product);
    }
}
