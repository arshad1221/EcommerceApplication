package com.ecommerce.project.productservice.customexception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestresponseEntityExceptionHanler extends ResponseEntityExceptionHandler {
	
	
	@ExceptionHandler(CustomException.class)
	public ResponseEntity<Errorresponse> hanldeproductServiceException(CustomException exception){
		
		return new ResponseEntity<>(new Errorresponse().builder()
				.errorResponse(exception.getMessage())
				.errorCode(exception.getErrorcode())
				.build(),HttpStatus.NOT_FOUND);
		
		
	}

}
