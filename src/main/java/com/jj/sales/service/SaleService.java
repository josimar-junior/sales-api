package com.jj.sales.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jj.sales.model.Sale;
import com.jj.sales.repository.ProductsRepository;
import com.jj.sales.repository.SalesRepository;

@Service
public class SaleService {

	@Autowired
	private SalesRepository salesRepository;

	@Autowired
	private ProductsRepository productsRepository;

	public List<Sale> findAll() {
		return salesRepository.findAll();
	}

	public Sale save(Sale sale) {
		sale.setRegistrationDate(LocalDateTime.now());
		sale.getItems().forEach(s -> {
			s.setSale(sale);
			s.setProduct(productsRepository.findById(s.getProduct().getId()).get());
		});

		sale.setTotal(getTotalItems(sale).add(sale.getFreight()));

		return salesRepository.save(sale);
	}

	private BigDecimal getTotalItems(Sale sale) {
		return sale.getItems().stream().map(s -> s.getProduct().getValue().multiply(new BigDecimal(s.getAmount())))
				.reduce(BigDecimal.ZERO, BigDecimal::add);
	}
}
