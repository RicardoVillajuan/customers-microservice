package com.bank.service;


import com.bank.entity.Natural;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface INaturalService {

    Mono<Natural> findById(String id);

    Flux<Natural> findAll();

    //Flux<Natural> findAllByType(CustomerType type);

    Mono<Natural> create(Natural natural);

    Mono<Natural> update(String id, Natural natural);

    Mono<Void> delete(String id);
    
    Mono<Natural> save(Natural natural);
}
