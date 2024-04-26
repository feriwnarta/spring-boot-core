package com.feriwinarta.belajarspringdasar.configurations;

import com.feriwinarta.belajarspringdasar.factory.PaymentGatewayClientFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        PaymentGatewayClientFactory.class
})
public class FactoryConfiguration {
}
