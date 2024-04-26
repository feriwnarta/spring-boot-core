package com.feriwinarta.belajarspringdasar;

import com.feriwinarta.belajarspringdasar.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class LazyBeanConfigurationTest {


    private ApplicationContext context;


    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(LazyBeanConfiguration.class);
        Assertions.assertNotNull(context);
    }

    @Test
    void testLazyBeanSuccess() {

        // saat bean dibuat menjadi lazy
        // bean itu tidak akan diload saat context dibuat
        // bean akan dibuat saaat get bean dipanggil

        Foo foo = context.getBean(Foo.class);
        Assertions.assertNotNull(foo);
    }
}
