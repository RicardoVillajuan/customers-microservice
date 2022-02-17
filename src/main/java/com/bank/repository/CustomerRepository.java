package com.bank.repository;


import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.bank.entity.Customer;

public interface CustomerRepository extends ReactiveMongoRepository<Customer, String> {
}
