package com.pos;

public class SaleItem {
	
	private double rate;
	private String des;
	
	public SaleItem() {
		super();
	}
	public SaleItem(double rate, String des) {
		super();
		this.rate = rate;
		this.des = des;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	
	

}
