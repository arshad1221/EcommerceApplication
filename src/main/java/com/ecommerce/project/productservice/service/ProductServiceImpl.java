package com.ecommerce.project.productservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.ecommerce.project.productservice.customexception.CustomException;
import com.ecommerce.project.productservice.entity.Product;
import com.ecommerce.project.productservice.modal.ProductRequest;
import com.ecommerce.project.productservice.productrepository.ProductRepository;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;


	@Override
	public long addProduct(ProductRequest productRequest) {
		log.info("adding product");
		Product p=Product.builder()
				.price(productRequest.getPrice())
				.productName(productRequest.getName())
				.productQuantity(productRequest.getQuantity()).build();

		productRepository.save(p);
		log.info("product created");

		return p.getProductId();
	}


	@Override
	public Product getProduct(long pid) {
		log.info("checking product in the inventory");
		Product p=productRepository.findById(pid).orElseThrow(()-> new CustomException("product with given id not found","PRODUCT_NOT FOUND"));
		return p;
	}


	@Override
	public Product reduceQuantity(long pid, long quantity) {
		// TODO Auto-generated method stub
		log.info("reducing product  quantity");
		Product p=productRepository.findById(pid).orElseThrow(()-> new CustomException("product with given id not found","PRODUCT_NOT FOUND"));
	    p.setProductQuantity(p.getProductQuantity()-quantity);
		productRepository.save(p);
		
		log.info("product quantity reduced successfully");
		return p;
	}

}
