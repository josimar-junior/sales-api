package com.jj.sales.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jj.sales.model.Sale;

public interface SalesRepository extends JpaRepository<Sale, Long> {

}
