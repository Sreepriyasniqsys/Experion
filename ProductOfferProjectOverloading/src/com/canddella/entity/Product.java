
package com.canddella.entity;

public class Product {
	
	private static String productCode;
	private static String productName;
	private static int productPrice;
	private String openDate;
	private String expiryDate;
	private String offerValidTillDate;
	private static int actualStock;
	
	public Product(String productCode, String productName, int productPrice, String openDate, String expiryDate,
			String offerValidTillDate, int actualStock) {
	
		this.productCode = productCode;
		this.productName = productName;
		this.productPrice = productPrice;
		this.openDate = openDate;
		this.expiryDate = expiryDate;
		this.offerValidTillDate = offerValidTillDate;
		this.actualStock = actualStock;
	}

	public static String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public static String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public static int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public String getOpenDate() {
		return openDate;
	}

	public void setOpenDate(String openDate) {
		this.openDate = openDate;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getOfferValidTillDate() {
		return offerValidTillDate;
	}

	public void setOfferValidTillDate(String offerValidTillDate) {
		this.offerValidTillDate = offerValidTillDate;
	}

	public static int getActualStock() {
		return actualStock;
	}

	public void setActualStock(int actualStock) {
		this.actualStock = actualStock;
	}
	
	
	
	
	
	
	
}
	