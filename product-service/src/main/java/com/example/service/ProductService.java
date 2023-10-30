package com.example.service;

import com.example.entity.Product;
import com.example.repository.ProductRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.text.MessageFormat;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class ProductService {

    @Autowired
    ProductRepo repo;

    public ResponseEntity<List<Product>> getProducts() {
        List<Product> products = repo.findAll();
        return ResponseEntity.ok(products);
    }

    public ResponseEntity<Product> getProductById(Integer id) {
        Optional<Product> product = repo.findById(id);
        if(product.isEmpty()) {
            log.info(MessageFormat.format("found id[{0}] is not found", id));
        }
        log.info(MessageFormat.format("id[{0}] is found", id));
        return product.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.status(HttpStatus.NO_CONTENT).body(new Product()));
    }
}
