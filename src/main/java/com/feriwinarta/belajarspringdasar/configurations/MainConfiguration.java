package com.feriwinarta.belajarspringdasar.configurations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(
        value = {
                "com.feriwinarta.belajarspringdasar.configurations",
                "com.feriwinarta.belajarspringdasar.services",
                "com.feriwinarta.belajarspringdasar.repositories",
        }
)
public class MainConfiguration {
}
