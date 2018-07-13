package com.jj.sales.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jj.sales.model.Customer;

public interface CustomersRepository extends JpaRepository<Customer, Long> {

}
