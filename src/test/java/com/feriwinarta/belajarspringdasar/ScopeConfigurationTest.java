package com.feriwinarta.belajarspringdasar;

import com.feriwinarta.belajarspringdasar.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.util.Assert;

public class ScopeConfigurationTest {

    private ApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(ScopeConfiguration.class);
        Assertions.assertNotNull(context);
    }

    @Test
    void testScopePrototype() {
        // default penggunaan scope adalah singleton
        // prototype default object creationnya adalah lazy
        Foo foo1 = context.getBean(Foo.class);
        Foo foo2 = context.getBean(Foo.class);
        Assertions.assertNotNull(foo1);

        Assertions.assertNotSame(foo1, foo2);
    }
}
