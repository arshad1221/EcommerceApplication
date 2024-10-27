package com.ecommerce.project.productservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {



	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long productId;

	@Column(name="product_Price")
	private long price;

	@Column(name="product_Name")
	private String productName;


	@Column(name="product_Quantity")
	private long productQuantity;


}
