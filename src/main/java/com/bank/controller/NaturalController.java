package com.bank.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.entity.Natural;

import com.bank.servicedb.NaturalServiceImpl;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/natural")
public class NaturalController {
	
	
	private final NaturalServiceImpl service;
    

    @GetMapping
    public Flux<Natural> findAll() {
        
    	return service.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Natural> findById(@PathVariable String id) {
        
    	return service.findById(id);
    }

    @PostMapping("")
    public Mono<Natural> create(@RequestBody Natural natural) {
        
    	return service.create(natural);
    }

    @PutMapping("/{id}")
    public Mono<Natural> update(@PathVariable String id, @RequestBody Natural natural) {
        
    	return service.findById(id).flatMap(e->{
    		
    	    e.setDni(natural.getDni());
    	    e.setFirstName(natural.getFirstName());
    	    e.setLastName(natural.getLastName());
    	    e.setEmail(natural.getEmail());
    	    e.setProfile(natural.getProfile());
    	    return service.save(natural);
    	});
    }

    @DeleteMapping("natural/{id}")
    public Mono<Void> delete(@PathVariable String id) {
        
    	
    	return service.delete(id);
    }
	
	
	
}
