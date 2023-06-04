package com.narek.bank.springbank.repository;

import com.narek.bank.springbank.model.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
