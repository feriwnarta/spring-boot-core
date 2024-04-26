package com.feriwinarta.belajarspringdasar;

import com.feriwinarta.belajarspringdasar.data.Bar;
import com.feriwinarta.belajarspringdasar.data.Foo;
import com.feriwinarta.belajarspringdasar.data.FooBar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependencyInjectionConfigurationTest {
    private ApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(DependencyInjectionConfiguration.class);
        Assertions.assertNotNull(context);
    }

    @Test
    void testDependecyInjectionSuccess() {
        Foo foo = context.getBean(Foo.class);
        Assertions.assertNotNull(foo);
        Bar bar = context.getBean(Bar.class);
        Assertions.assertNotNull(bar);
        FooBar fooBar = context.getBean("fooBar", FooBar.class);
        Assertions.assertNotNull(fooBar);

        Assertions.assertSame(foo, fooBar.getFoo());
        Assertions.assertSame(bar, fooBar.getBar());

    }

    // menentukan sendiri bean nama yang akan dipilih
    @Test
    void testCreateBeanWithQualifierSuccess() {
        Foo foo = context.getBean(Foo.class);
        Assertions.assertNotNull(foo);
        Bar bar = context.getBean("bar2", Bar.class);
        Assertions.assertNotNull(bar);
        FooBar fooBar = context.getBean("fooBar2", FooBar.class);
        Assertions.assertNotNull(fooBar);

        Assertions.assertSame(foo, fooBar.getFoo());
        Assertions.assertSame(bar, fooBar.getBar());
    }
}
