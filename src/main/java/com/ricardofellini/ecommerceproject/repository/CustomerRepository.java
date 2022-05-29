package com.ricardofellini.ecommerceproject.repository;

import com.ricardofellini.ecommerceproject.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
