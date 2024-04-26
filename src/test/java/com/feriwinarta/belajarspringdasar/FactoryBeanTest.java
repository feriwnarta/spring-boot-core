package com.feriwinarta.belajarspringdasar;

import com.feriwinarta.belajarspringdasar.clients.PaymentGatewayClient;
import com.feriwinarta.belajarspringdasar.configurations.FactoryConfiguration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FactoryBeanTest {

    private ConfigurableApplicationContext context;
    private ListableBeanFactory beanFactory;

    @BeforeEach
    void setUp() {
//

        context = new AnnotationConfigApplicationContext(FactoryConfiguration.class);
        Assertions.assertNotNull(context);
        context.registerShutdownHook();
    }


    @Test
    void testFactorySuccess() {
        PaymentGatewayClient gatewayClient = context.getBean(PaymentGatewayClient.class);
        Assertions.assertNotNull(gatewayClient);
        Assertions.assertEquals("private", gatewayClient.getPrivateKey());
        Assertions.assertEquals("https://example.com", gatewayClient.getEndpoint());
    }
}
