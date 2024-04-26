package com.feriwinarta.belajarspringdasar;

import com.feriwinarta.belajarspringdasar.data.Bar;
import com.feriwinarta.belajarspringdasar.data.Foo;
import com.feriwinarta.belajarspringdasar.data.FooBar;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DependencyInjectionConfiguration {


    @Bean
    public Foo foo() {
        return new Foo();
    }

    @Bean
    @Primary
    public Bar bar() {
        return new Bar();
    }

    @Bean
    public Bar bar2() {
        return new Bar();
    }


    @Bean
    public FooBar fooBar(Foo foo, Bar bar) {
        return new FooBar(foo, bar);
    }

    @Bean
    public FooBar fooBar2(Foo foo, @Qualifier("bar2") Bar bar) {
        return new FooBar(foo, bar);
    }
}
