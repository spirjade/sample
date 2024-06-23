package com.pustaknotika.suppliers.pojo;

import lombok.Data;

@Data
public class PntkCustomers {
	private int customerId;
	private String customerName;
	private String phoneNumber;
	private String countryCode;
	private String state;
	private String city;
	private String area;
	private String address;
	private String pinCode;
	private Boolean isActive;
	private double longitude;
	private double latitude;
	private String createdDateTime;
	private String lastUpdatedDateTime;

}
