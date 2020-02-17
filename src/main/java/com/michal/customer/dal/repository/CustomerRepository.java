package com.michal.customer.dal.repository;

import com.michal.customer.dal.entities.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
