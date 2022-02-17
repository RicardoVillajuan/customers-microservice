package com.bank.service;


import com.bank.entity.Customer;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ICustomerService {

    Mono<Customer> findById(String id);

    Flux<Customer> findAll();

    Mono<Customer> create(Customer customer);

    Mono<Customer> update(String id, Customer customer);

    Mono<Void> delete(String id);
    
    Mono<Customer> save(Customer customer);
}
