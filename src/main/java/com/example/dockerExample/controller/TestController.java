package com.example.dockerExample.controller;

import com.example.dockerExample.entity.Product;
import com.example.dockerExample.repository.ProductRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    private final ProductRepository repository;

    public TestController(ProductRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Product> getAll(){
        return repository.findAll();
    }
}
