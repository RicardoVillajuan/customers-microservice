package com.bank.servicedb;

import org.springframework.stereotype.Service;

import com.bank.entity.Enterprise;
import com.bank.repository.EnterpriseRepository;
import com.bank.service.IEnterpriseService;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class EnterpriseServiceDb implements IEnterpriseService{

	private final EnterpriseRepository repoEnterprise;

	@Override
	public Mono<Enterprise> save(Enterprise enterprise) {
		// TODO Auto-generated method stub
		return repoEnterprise.save(enterprise);
	}

	@Override
	public Flux<Enterprise> findAll() {
		// TODO Auto-generated method stub
		return repoEnterprise.findAll();
	}

	@Override
	public Mono<Void> deleteById(String id) {
		// TODO Auto-generated method stub
		return repoEnterprise.deleteById(id);
	}

	@Override
	public Mono<Enterprise> findById(String id) {
		// TODO Auto-generated method stub
		return repoEnterprise.findById(id);
	}
	
	
}
