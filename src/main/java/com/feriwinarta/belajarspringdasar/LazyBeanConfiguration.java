package com.feriwinarta.belajarspringdasar;

import com.feriwinarta.belajarspringdasar.data.Bar;
import com.feriwinarta.belajarspringdasar.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Slf4j
@Configuration
public class LazyBeanConfiguration {

    @Lazy
    @Bean
    public Foo foo() {
        log.info("Init Foo");
        return new Foo();
    }

    @Bean
    public Bar bar() {
        log.info("Init Bar");
        return new Bar();
    }
}
