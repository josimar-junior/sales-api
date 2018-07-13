package com.jj.sales.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jj.sales.model.Product;

public interface ProductsRepository extends JpaRepository<Product, Long> {

}
