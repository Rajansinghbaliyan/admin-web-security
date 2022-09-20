package com.frankmoley.lil.adminweb.data.repository;

import com.fasterxml.jackson.annotation.OptBoolean;
import com.frankmoley.lil.adminweb.data.model.Customer;
import com.frankmoley.lil.adminweb.web.services.CustomerService;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {
    Optional<Customer> findCustomerByEmail(String email);
}
