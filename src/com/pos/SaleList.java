package com.pos;

import java.util.ArrayList;

public class SaleList {
	
	private String dtSale;
	private String CusName;
	
	//SaleList has many sales
	ArrayList<Sale> sales = new ArrayList<>();
	
	public SaleList() {
		super();
	}

	public SaleList(String dtSale, String cusName) {
		super();
		this.dtSale = dtSale;
		CusName = cusName;
	}
	
	
	public String getDtSale() {
		return dtSale;
	}


	public void setDtSale(String dtSale) {
		this.dtSale = dtSale;
	}


	public String getCusName() {
		return CusName;
	}


	public void setCusName(String cusName) {
		CusName = cusName;
	}


	public ArrayList<Sale> getSales() {
		return sales;
	}


	public void setSales(ArrayList<Sale> sales) {
		this.sales = sales;
	}



	

}
