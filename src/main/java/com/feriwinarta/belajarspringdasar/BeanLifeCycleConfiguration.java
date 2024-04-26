package com.feriwinarta.belajarspringdasar;

import com.feriwinarta.belajarspringdasar.data.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanLifeCycleConfiguration {

//    @Bean(
//            initMethod = "start",
//            destroyMethod = "stop"
//    )
    @Bean
    public Server server() {
        return new Server();
    }
}
