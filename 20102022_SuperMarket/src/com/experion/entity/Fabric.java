package com.experion.entity;

import com.experion.service.FabricInterface;

public class Fabric extends Product implements FabricInterface {
	public Fabric(String productCode, String productName) {
		super(productCode, productName);
	}
	private String fabricCode;
	private String fabricName;
	
	public String getFabricCode() {
		return fabricCode;
	}
	public void setFabricCode(String fabricCode) {
		this.fabricCode = fabricCode;
	}
	public String getFabricName() {
		return fabricName;
	}
	public void setFabricName(String fabricName) {
		this.fabricName = fabricName;
	}
	@Override
	public void ProductExchange() {
		System.out.println("Exchange in fabrics");		
	}
	@Override
	public void ProductRepair() {
		System.out.println("Fabric products repairing ");
		
	}
	@Override
	public void warrantlyReplacement() {
		System.out.println("Warranty replacements in fabrics");

	}
	
}
