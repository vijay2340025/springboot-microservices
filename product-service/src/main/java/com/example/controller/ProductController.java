package com.example.controller;

import com.example.entity.Product;
import com.example.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.text.MessageFormat;
import java.util.List;

@RestController
@Slf4j
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProducts() {
        log.info("all products service invoked");
        return productService.getProducts();
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Integer id) {
        log.info(MessageFormat.format("searching id[{0}] in all products", id));
        return productService.getProductById(id);
    }
}
