package com.feriwinarta.belajarspringdasar;

import com.feriwinarta.belajarspringdasar.application.FooApplication;
import com.feriwinarta.belajarspringdasar.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = FooApplication.class)
public class SpringBootApplicationTest {


    @Autowired
    public Foo foo;


    @Test
    void fooNotNull() {
        Assertions.assertNotNull(foo);
    }
}
