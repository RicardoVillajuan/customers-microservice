package com.bank.repository;


import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.bank.entity.Natural;

public interface NaturalRepository extends ReactiveMongoRepository<Natural, String> {
}
