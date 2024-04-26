package com.feriwinarta.belajarspringdasar;

import com.feriwinarta.belajarspringdasar.configurations.MainConfiguration;
import com.feriwinarta.belajarspringdasar.repositories.ProductRepository;
import com.feriwinarta.belajarspringdasar.services.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentProductServiceTest {

    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(MainConfiguration.class);
    }


    @Test
    void testGetBeanSuccess() {
        ProductService productService1 = context.getBean(ProductService.class);
        ProductService productService2 = context.getBean(ProductService.class);
        Assertions.assertSame(productService2, productService1);
    }


    @Test
    void testGetBeanConstructorInjectSuccess() {
        ProductService productService1 = context.getBean(ProductService.class);
        ProductRepository productRepository = context.getBean(ProductRepository.class);

        Assertions.assertSame(productRepository, productService1.getProductRepository());


    }
}
