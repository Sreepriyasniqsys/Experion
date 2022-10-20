package com.experion.entity;

import com.experion.service.ElectronicsInterface;

public class Electronics extends Product implements ElectronicsInterface{
	public Electronics(String productCode, String productName) {
		super(productCode, productName);
	}
	private String electronicsCode;
	private String electronicsName;
	public String getElectronicsCode() {
		return electronicsCode;
	}
	public void setElectronicsCode(String electronicsCode) {
		this.electronicsCode = electronicsCode;
	}
	public String getElectronicsName() {
		return electronicsName;
	}
	public void setElectronicsName(String electronicsName) {
		this.electronicsName = electronicsName;
	}
	@Override
	public void ProductExchange() {
		System.out.println("Electronics products replacement available :");
		
	}
	@Override
	public void ProductRepair() {
		System.out.println("Electronics products repairing ");
		
	}
	@Override
	public void warrantlyReplacement() {
		System.out.println("Warranty replacements in electronics products");
		
	}
	

}
