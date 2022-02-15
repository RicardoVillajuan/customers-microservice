package com.bank.service;

import com.bank.entity.Enterprise;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IEnterpriseService {

	
	Mono<Enterprise> save(Enterprise enterprise);
	Flux<Enterprise> findAll();
	Mono<Void> deleteById(String id);
	Mono<Enterprise> findById(String id);
}
