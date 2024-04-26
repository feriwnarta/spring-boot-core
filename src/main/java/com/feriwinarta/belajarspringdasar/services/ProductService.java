package com.feriwinarta.belajarspringdasar.services;

import com.feriwinarta.belajarspringdasar.repositories.ProductRepository;
import jakarta.annotation.PostConstruct;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Scope
//@Lazy
@Component
public class ProductService {

    @Getter
    private ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public ProductService(ProductRepository productRepository, String name) {
        this.productRepository = productRepository;
    }

    // untuk melakukan dependecy injection bisa melalui beberapa cara
    // 1. constructor -> constructor harus 1, jika lebih dari satu harus diberikan @Autowired ke construtor yang akan diinject oleh spring
    // 2. Setter
    // 3. Field

}
