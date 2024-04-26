package com.feriwinarta.belajarspringdasar;

import com.feriwinarta.belajarspringdasar.data.Bar;
import com.feriwinarta.belajarspringdasar.data.Foo;
import com.feriwinarta.belajarspringdasar.data.FooBar;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Slf4j
@Configuration
public class DependsOnConfiguration {

    @Bean
    public FooBar fooBar(Bar bar, Foo foo) {
        log.info("foo bar created");
        return new FooBar(foo, bar);
    }


    @DependsOn({
            "foo"
    })
    @Bean
    public Bar bar(){
        log.info("bar bean created");
        return new Bar();
    }

    @Bean
    public Foo foo(){
        log.info("foo bean created");
        return new Foo();
    }







}
