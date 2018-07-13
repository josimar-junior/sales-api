package com.jj.sales.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jj.sales.model.Product;
import com.jj.sales.service.ProductService;

@CrossOrigin("*")
@RestController
@RequestMapping("/products")
public class ProductsResource {

	@Autowired
	private ProductService productService;
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll() {
		return ResponseEntity.status(HttpStatus.OK).body(productService.findAll());
	}
}
