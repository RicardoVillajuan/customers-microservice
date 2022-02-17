package com.bank.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.entity.Customer;

import com.bank.servicedb.CustomerServiceDb;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/customer")
public class CustomerController {
	
	
	private final CustomerServiceDb service;
    

    @GetMapping
    public Flux<Customer> findAll() {
        
    	return service.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Customer> findById(@PathVariable String id) {
        
    	return service.findById(id);
    }

    @PostMapping
    public Mono<Customer> create(@RequestBody Customer customer) {
        
    	return service.create(customer);
    }

    @PutMapping("/{id}")
    public Mono<Customer> update(@PathVariable String id, @RequestBody Customer customer) {
        
    	return service.update(id, customer);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable String id) {
        
    	return service.delete(id);
    }
	
	
	
}
