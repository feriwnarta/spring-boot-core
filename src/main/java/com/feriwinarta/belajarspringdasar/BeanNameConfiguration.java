package com.feriwinarta.belajarspringdasar;

import com.feriwinarta.belajarspringdasar.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanNameConfiguration {


    @Bean("fooFirst")
    public Foo foo1() {return new Foo();}
    @Bean("fooSecond")
    public Foo foo2() {return new Foo();}

}
