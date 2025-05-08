package com.electroapp.electro_app.infrastructure.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.electroapp.electro_app.application.services.IProductservice;
import com.electroapp.electro_app.domain.entities.Product;

public class ProductController {
        @Autowired
    private IProductservice productservice;
    
    @GetMapping
    public List<Product> list(){
        return productservice.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Product> show(@PathVariable Long id){
        return productservice.findById(id);
    }

}
