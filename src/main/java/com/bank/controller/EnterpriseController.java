package com.bank.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bank.entity.Enterprise;
import com.bank.service.IEnterpriseService;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController
@RequiredArgsConstructor
@RequestMapping("/enterprise")
public class EnterpriseController {

	private final IEnterpriseService enterpriseService;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Mono<Enterprise> save(@RequestBody Enterprise enterprise){
		
		return enterpriseService.save(enterprise);
	}
	
	@GetMapping
	public Flux<Enterprise> findAll(){
		
		return enterpriseService.findAll();
	}
	
	@GetMapping("/{id}")
	public Mono<Enterprise> findById(@PathVariable String id){
		
		return enterpriseService.findById(id);
	}
	
	@PutMapping("/{id}")
	public Mono<Enterprise> edit(@PathVariable String id,@RequestBody Enterprise enterprise){
		
		
		return enterpriseService.findById(id)
				.flatMap(e->{
					e.setName(enterprise.getName());
					e.setProfile(enterprise.getProfile());
					e.setRuc(enterprise.getRuc());
					e.setType(enterprise.getType());
					return enterpriseService.save(e);
				});
	}
	
	@DeleteMapping("/{id}")
	public Mono<Void> deleteById(@PathVariable String id){
		
		return enterpriseService.deleteById(id);
	}
}
