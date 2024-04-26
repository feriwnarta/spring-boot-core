package com.feriwinarta.belajarspringdasar;

import com.feriwinarta.belajarspringdasar.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanConfigurationTest {

    @Test
    void testCreateConfigurationSuccess() {

        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
        Assertions.assertNotNull(context);

    }

    @Test
    void testGetBeanFooSuccess() {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
        Assertions.assertNotNull(context);

        Foo bean1 = context.getBean(Foo.class);
        Foo bean2 = context.getBean(Foo.class);

        Assertions.assertSame(bean2, bean1);

    }
}
