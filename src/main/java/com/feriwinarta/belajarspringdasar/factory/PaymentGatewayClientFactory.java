package com.feriwinarta.belajarspringdasar.factory;

import com.feriwinarta.belajarspringdasar.clients.PaymentGatewayClient;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class PaymentGatewayClientFactory implements FactoryBean<PaymentGatewayClient> {

    @Override
    public PaymentGatewayClient getObject() throws Exception {
        return new PaymentGatewayClient("https://example.com", "private");
    }

    @Override
    public Class<?> getObjectType() {
        return PaymentGatewayClient.class;
    }
}
