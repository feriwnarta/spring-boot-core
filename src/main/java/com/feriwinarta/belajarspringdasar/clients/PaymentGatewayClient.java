package com.feriwinarta.belajarspringdasar.clients;


import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data

// third party library
public class PaymentGatewayClient {

    private String endpoint;
    private String privateKey;

}
