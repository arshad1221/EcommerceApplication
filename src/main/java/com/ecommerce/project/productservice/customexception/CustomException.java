package com.ecommerce.project.productservice.customexception;

import lombok.Data;

@Data
public class CustomException  extends RuntimeException{
	
	     String errorcode;
	     
	     
	   public   CustomException(String errorcode,String message){
	    	 
	    	 super(message);
	    	 this.errorcode= errorcode;
	    	 
	    	 
	     };
	 
	
	
	

}

		
