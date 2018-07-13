package com.jj.sales.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jj.sales.model.Product;
import com.jj.sales.repository.ProductsRepository;

@Service
public class ProductService {

	@Autowired
	private ProductsRepository productsRepository;
	
	public List<Product> findAll() {
		return productsRepository.findAll();
	}
}
