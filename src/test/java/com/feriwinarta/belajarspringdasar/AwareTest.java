package com.feriwinarta.belajarspringdasar;

import com.feriwinarta.belajarspringdasar.services.AuthService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

public class AwareTest {

    @Configuration
    @Import({AuthService.class})
    public static class TestConfiguration {

    }


    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(TestConfiguration.class);
    }

    @Test
    void testAwareSuccess() {

        AuthService authService = context.getBean(AuthService.class);
        Assertions.assertNotNull(authService);

        Assertions.assertNotNull(authService.getName());
        System.out.println(authService.getName());

        Assertions.assertSame(context, authService.getContext());
    }
}
