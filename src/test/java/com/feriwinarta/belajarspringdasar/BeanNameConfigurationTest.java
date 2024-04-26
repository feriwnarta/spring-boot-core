package com.feriwinarta.belajarspringdasar;

import com.feriwinarta.belajarspringdasar.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanNameConfigurationTest {

    private ApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(BeanNameConfiguration.class);
        Assertions.assertNotNull(context);
    }


    @Test
    @DisplayName("get bean from value annotation bean")
    void testGetBeanFromBeanNameSuccess() {
        Foo fooFirst = context.getBean("fooFirst", Foo.class);
        Assertions.assertNotNull(fooFirst);
        Foo fooSecond = context.getBean("fooSecond", Foo.class);
        Assertions.assertNotNull(fooSecond);

        Assertions.assertNotSame(fooFirst, fooSecond);

    }
}
