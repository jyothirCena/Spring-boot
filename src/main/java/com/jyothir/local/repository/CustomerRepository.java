package com.jyothir.local.repository;

import com.jyothir.local.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    Optional<Customer> getCustomerByEmail(String email);
}
