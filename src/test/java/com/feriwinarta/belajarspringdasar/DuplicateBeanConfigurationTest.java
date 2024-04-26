package com.feriwinarta.belajarspringdasar;

import com.feriwinarta.belajarspringdasar.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DuplicateBeanConfigurationTest {

    @Test
    void testCreateDuplicateBeanSuccess() {
        ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateBeanConfiguration.class);
        Assertions.assertNotNull(context);


        Foo foo1 = context.getBean("foo1", Foo.class);
        Foo foo2 = context.getBean("foo2", Foo.class);
        Foo foo3 = context.getBean("foo2", Foo.class);
        Assertions.assertNotSame(foo2, foo1);
        Assertions.assertSame(foo2, foo3);

    }

    @Test
    void testCreateDuplicateBeanError() {
        ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateBeanConfiguration.class);
        Assertions.assertNotNull(context);

        Assertions.assertThrows(NoUniqueBeanDefinitionException.class, () -> {
            Foo foo = context.getBean(Foo.class);
        });

    }


}
