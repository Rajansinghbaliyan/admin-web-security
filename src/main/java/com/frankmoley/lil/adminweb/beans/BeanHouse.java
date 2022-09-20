package com.frankmoley.lil.adminweb.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class BeanHouse {
    @Bean
    public PasswordEncoder getPasswordEncoder() {
        return new Pbkdf2PasswordEncoder();
    }
}
