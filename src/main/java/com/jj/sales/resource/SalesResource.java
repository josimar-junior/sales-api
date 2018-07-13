package com.jj.sales.resource;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.jj.sales.model.Sale;
import com.jj.sales.service.SaleService;

@CrossOrigin("*")
@RestController
@RequestMapping("/sales")
public class SalesResource {

	@Autowired
	private SaleService saleService;

	@GetMapping
	public ResponseEntity<List<Sale>> findAll() {
		return ResponseEntity.status(HttpStatus.OK).body(saleService.findAll());
	}

	@PostMapping
	public ResponseEntity<Void> save(@Valid @RequestBody Sale sale) {
		sale = saleService.save(sale);

		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(sale.getId()).toUri();

		return ResponseEntity.created(uri).build();
	}
}
