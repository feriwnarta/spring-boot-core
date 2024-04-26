package com.feriwinarta.belajarspringdasar.data;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
@Getter
public class Product implements IdAware{

    private String id;

    @Override
    public void setId(String id) {
        this.id = id;
    }
}
