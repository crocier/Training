package com.pos;

public class Sale {
	
	private int qty;
	private double discount;
	
	//sale has a sale item
	private SaleItem item;

	public Sale() {
		super();
	}

	public Sale(int qty, double discount, SaleItem item) {
		super();
		this.qty = qty;
		this.discount = discount;
		this.item = item;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public SaleItem getItem() {
		return item;
	}

	public void setItem(SaleItem item) {
		this.item = item;
	}
	
	

}
