package com.feriwinarta.belajarspringdasar;

import com.feriwinarta.belajarspringdasar.data.Foo;
import jdk.jfr.Name;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class PrimaryBeanConfiguration {

    @Primary
    @Bean()
    public Foo foo1(){
        return new Foo();
    }


    @Bean
    public Foo foo2(){
        return new Foo();
    }
}
