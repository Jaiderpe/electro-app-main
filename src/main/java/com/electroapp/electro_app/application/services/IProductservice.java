package com.electroapp.electro_app.application.services;

import java.util.List;
import java.util.Optional;

import com.electroapp.electro_app.domain.entities.Product;

public interface IProductservice {
    Optional<Product> findById(Long id);
    List<Product> getAll();
    Product save(Product product);
}
