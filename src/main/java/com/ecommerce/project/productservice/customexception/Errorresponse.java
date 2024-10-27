package com.ecommerce.project.productservice.customexception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Errorresponse {
	
	
	String errorResponse;
	String errorCode;
	

}
