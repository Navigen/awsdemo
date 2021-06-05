package com.ivpe.awsdemo.repository;

import com.ivpe.awsdemo.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Long> {

    List<Product> findAll();

    Product findById(long id);
}
