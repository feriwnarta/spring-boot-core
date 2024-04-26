package com.feriwinarta.belajarspringdasar;

import com.feriwinarta.belajarspringdasar.data.Product;
import static org.junit.jupiter.api.Assertions.*;

import com.feriwinarta.belajarspringdasar.processor.IdGeneratorBeanPostProcessor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


public class IdGeneratorBeanPostProcessorTest {
    
    private ConfigurableApplicationContext context;
    
    @Configuration
    @Import({
            IdGeneratorBeanPostProcessor.class,
            Product.class
    })
    public static class TestConfiguration {
        
    }

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(TestConfiguration.class);
        assertNotNull(context); 
    }

    @Test
    void testBeanPostProcessorSuccess() {
        Product bean = context.getBean(Product.class);
        assertNotNull(bean);
        assertNotNull(bean.getId());

    }
}
