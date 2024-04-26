package com.feriwinarta.belajarspringdasar.services;

import com.feriwinarta.belajarspringdasar.repositories.CustomerRepository;
import lombok.Data;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerService {

    @Getter
    @Autowired // -> tidak direkomendasikan
    private CustomerRepository customerRepository;

}
