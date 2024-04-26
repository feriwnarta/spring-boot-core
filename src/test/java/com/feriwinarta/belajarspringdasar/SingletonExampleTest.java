package com.feriwinarta.belajarspringdasar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingletonExampleTest {

    @Test
    void testCreateExampleSingletonSuccess() {

        var singletonExample1 = SingletonExample.getInstance();
        var singletonExample2 = SingletonExample.getInstance();

        Assertions.assertSame(singletonExample1, singletonExample2);

    }
}
