package com.feriwinarta.belajarspringdasar;

import com.feriwinarta.belajarspringdasar.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrimaryBeanConfigurationTest {


    @Test
    void testPrimaryBeanSuccess() {
        ApplicationContext context = new AnnotationConfigApplicationContext(PrimaryBeanConfiguration.class);
        Assertions.assertNotNull(context);

        Foo foo1 = context.getBean(Foo.class);
        Foo foo2 = context.getBean(Foo.class);

        Assertions.assertSame(foo2, foo1);

    }
}
