package com.ecommerce.project.productservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.project.productservice.entity.Product;
import com.ecommerce.project.productservice.modal.ProductRequest;
import com.ecommerce.project.productservice.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	
	
	@PostMapping("/add")
	public ResponseEntity<Long> addPoduct(@RequestBody ProductRequest productRequest) {
		
		long productId=productService.addProduct(productRequest);
		
		return new ResponseEntity<>(productId,HttpStatus.CREATED);
		
		
		
	}
	
	
	@GetMapping("/add/{Pid}")
	public ResponseEntity<Product> getPoduct(@PathVariable long Pid) {
		
		Product p=productService.getProduct(Pid);
		
		return new ResponseEntity<>(p,HttpStatus.FOUND);
		
		
		
	}
	
	
	@PutMapping("/reduce/{Pid}")
	public ResponseEntity<Void> reducePoductQuantity(@PathVariable long Pid,@RequestParam long quantity) {
		
		Product p=productService.reduceQuantity(Pid,quantity);
		
		return new ResponseEntity<>(HttpStatus.OK);
		
		
		
	}
	
	
	
	
	
	@GetMapping
	public String test() {
		
		return "working fine";
		
	}
	
	
	

}
