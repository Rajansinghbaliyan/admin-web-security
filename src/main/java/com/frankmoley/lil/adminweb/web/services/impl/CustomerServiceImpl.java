package com.frankmoley.lil.adminweb.web.services.impl;

import com.frankmoley.lil.adminweb.data.model.Customer;
import com.frankmoley.lil.adminweb.data.repository.CustomerRepository;
import com.frankmoley.lil.adminweb.web.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Customer customer = repository.findCustomerByEmail(username)
                .orElse(null);
        return new User(customer.getEmail(), customer.getPasswordHash(),new ArrayList<>());
    }
}
