package com.feriwinarta.belajarspringdasar;

import com.feriwinarta.belajarspringdasar.configurations.MainConfiguration;
import com.feriwinarta.belajarspringdasar.services.CustomerService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CustomerServiceTest {

    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(MainConfiguration.class);
        Assertions.assertNotNull(context);
        context.registerShutdownHook();
    }

    @Test
    void testFieldDependencyInjectionSuccess() {

        CustomerService customerService = context.getBean(CustomerService.class);
        Assertions.assertNotNull(customerService.getCustomerRepository());

    }
}
