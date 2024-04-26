package com.feriwinarta.belajarspringdasar;

import com.feriwinarta.belajarspringdasar.configurations.InheritanceConfiguration;
import com.feriwinarta.belajarspringdasar.services.MerchantService;
import com.feriwinarta.belajarspringdasar.services.MerchantServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InheritanceTest {

    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(InheritanceConfiguration.class);
        Assertions.assertNotNull(context);
        context.registerShutdownHook();
    }

    @Test
    void testInheritancePrimarySuccess() {
        MerchantService service1 = context.getBean(MerchantService.class);
        MerchantService service2 = context.getBean(MerchantServiceImpl.class);

        Assertions.assertSame(service2, service1);
    }

    @Test
    void testInheritanceNotPrimarySuccess() {
        MerchantService service1 = context.getBean("com.feriwinarta.belajarspringdasar.services.MerchantPremiumServiceImpl", MerchantService.class);
        MerchantService service2 = context.getBean(MerchantServiceImpl.class);

        Assertions.assertNotSame(service2, service1);
    }
}
