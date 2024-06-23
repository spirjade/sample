package com.pustaknotika.suppliers.pojo;

import lombok.Data;

@Data
public class PntkProducts {
	private int productId;
	private String productImage;
	private String productName;
	private int supplierId;
	private double sellingPrice;
	private String currency;
	private int unitId;
	private int categoryId;
	private Boolean isActive;
	private String createdDateTime;
	private String lastUpdatedDateTime;

}
