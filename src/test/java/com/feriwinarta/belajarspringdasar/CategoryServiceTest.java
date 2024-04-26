package com.feriwinarta.belajarspringdasar;

import com.feriwinarta.belajarspringdasar.configurations.MainConfiguration;
import com.feriwinarta.belajarspringdasar.services.CategoryService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CategoryServiceTest {

    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(MainConfiguration.class);
        Assertions.assertNotNull(context);
        context.registerShutdownHook();
    }

    @Test
    void testSetterDependencySuccess() {


        CategoryService bean = context.getBean(CategoryService.class);
        Assertions.assertNotNull(bean);
        Assertions.assertNotNull(bean.getCategoryRepository());
        Assertions.assertNotNull(bean.getProductRepository());

    }
}
