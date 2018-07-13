package com.jj.sales.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jj.sales.model.Customer;
import com.jj.sales.service.CustomerService;

@CrossOrigin("*")
@RestController
@RequestMapping("/customers")
public class CustomersResource {

	@Autowired
	private CustomerService customerService;
	
	@GetMapping
	public ResponseEntity<List<Customer>> findAll() {
		return ResponseEntity.status(HttpStatus.OK).body(customerService.findAll());
	}
}
