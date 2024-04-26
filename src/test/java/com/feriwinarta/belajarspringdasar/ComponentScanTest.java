package com.feriwinarta.belajarspringdasar;


import com.feriwinarta.belajarspringdasar.configurations.MainConfiguration;
import com.feriwinarta.belajarspringdasar.data.Bar;
import com.feriwinarta.belajarspringdasar.data.Foo;
import lombok.val;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentScanTest {

    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(MainConfiguration.class);
        Assertions.assertNotNull(context);
        context.registerShutdownHook();
    }

    @Test
    void testSuccessComponentScan() {
        Foo foo = context.getBean(Foo.class);
        Bar bar = context.getBean(Bar.class);
        Assertions.assertNotNull(foo);
        Assertions.assertNotNull(bar);
    }
}
