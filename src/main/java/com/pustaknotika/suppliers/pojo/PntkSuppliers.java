package com.pustaknotika.suppliers.pojo;

import java.io.Serializable;

import lombok.Data;

@Data
public class PntkSuppliers implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int supplierId;
	private String supplierName;
	private String supplierUserName;
	private String phoneNumber;
	private String countryCode; 	     
	private String state; 			
	private String city; 				
	private String area; 				
	private String address; 			
	private String pinCode; 			
	private Boolean isActive ;			
	private double longitude; 		
	private double latitude; 			
	private String referralCode; 		
	private String createdDateTime;  	
	private String lastUpdatedDateTime;

}
