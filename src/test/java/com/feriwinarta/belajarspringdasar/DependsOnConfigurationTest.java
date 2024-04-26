package com.feriwinarta.belajarspringdasar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependsOnConfigurationTest {


    private ApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(DependsOnConfiguration.class);
        Assertions.assertNotNull(context);
    }


    @Test
    void testDependsOn() {
        // bean defaultny dibuat dari atas ke bawah secara urut
        // jika ada bean yang membutuhkan dependency
        // maka urutan pembuatanya sesuai dari posisi bean di parameter tersebut
    }
}
