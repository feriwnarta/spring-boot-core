package com.feriwinarta.belajarspringdasar;

import com.feriwinarta.belajarspringdasar.configurations.BarConfiguration;
import com.feriwinarta.belajarspringdasar.configurations.FooConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({
        FooConfiguration.class,
        BarConfiguration.class
})
@Configuration
public class ImportConfiguration {
}
