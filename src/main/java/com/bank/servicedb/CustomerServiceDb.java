package com.bank.servicedb;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import com.bank.entity.Customer;
import com.bank.repository.CustomerRepository;
import com.bank.service.ICustomerService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class CustomerServiceDb implements ICustomerService {

	private final CustomerRepository repoCustomer;

	@Override
	public Mono<Customer> findById(String id) {
		return repoCustomer.findById(id).single();
	}

	@Override
	public Flux<Customer> findAll() {
		return repoCustomer.findAll();
	}

	@Override
	public Mono<Customer> create(Customer customer) {
		
		return repoCustomer.save(customer);
	}

	@Override
	public Mono<Customer> update(String id, Customer customer) {
		return repoCustomer.findById(id).flatMap(naturalFound -> {
			return repoCustomer.save(customer);
		});
	}

	@Override
	public Mono<Void> delete(String id) {
		return repoCustomer.deleteById(id);
	}

	@Override
	public Mono<Customer> save(Customer customer) {
		// TODO Auto-generated method stub
		return repoCustomer.save(customer);
	}
}
