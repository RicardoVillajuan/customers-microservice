package com.bank.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.bank.entity.Enterprise;

public interface EnterpriseRepository extends ReactiveMongoRepository<Enterprise,String>{

	
	
}
