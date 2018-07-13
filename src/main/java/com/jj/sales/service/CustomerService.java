package com.jj.sales.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jj.sales.model.Customer;
import com.jj.sales.repository.CustomersRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomersRepository customersRepository;

	public List<Customer> findAll() {
		return customersRepository.findAll();
	}
}
