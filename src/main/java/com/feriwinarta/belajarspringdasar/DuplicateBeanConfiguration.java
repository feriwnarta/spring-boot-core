package com.feriwinarta.belajarspringdasar;

import com.feriwinarta.belajarspringdasar.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DuplicateBeanConfiguration {

    @Bean
    public Foo foo1() { return new Foo(); }

    @Bean
    public Foo foo2() { return new Foo(); }
}
