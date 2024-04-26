package com.feriwinarta.belajarspringdasar.application;

import com.feriwinarta.belajarspringdasar.data.Foo;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FooApplication {

    @Bean
    public Foo foo() {
        return new Foo();
    }
}
