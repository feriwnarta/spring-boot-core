package com.feriwinarta.belajarspringdasar.configurations;

import com.feriwinarta.belajarspringdasar.services.MerchantPremiumServiceImpl;
import com.feriwinarta.belajarspringdasar.services.MerchantServiceImpl;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        MerchantServiceImpl.class,
        MerchantPremiumServiceImpl.class,
})
public class InheritanceConfiguration {
}
