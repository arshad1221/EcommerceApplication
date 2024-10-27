package com.ecommerce.project.productservice.productrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.project.productservice.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
