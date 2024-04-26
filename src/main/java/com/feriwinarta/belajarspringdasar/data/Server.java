package com.feriwinarta.belajarspringdasar.data;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Server {

    @PostConstruct
    public void start() {
        log.info("starting server");
    }


    @PreDestroy
    public void stop(){
        log.info("stopping server");
    }

}
