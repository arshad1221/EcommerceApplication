package com.ecommerce.project.productservice.service;

import com.ecommerce.project.productservice.entity.Product;
import com.ecommerce.project.productservice.modal.ProductRequest;

public interface ProductService {

	long addProduct(ProductRequest productRequest);

	Product getProduct(long pid);

	Product reduceQuantity(long pid, long quantity);

}
