package com.pos;

import java.util.ArrayList;

public class BillingSys {
	
	//billingsys has a StdTaxCalc
	private StdTaxCalc taxCal;
	
	public void generateBill(SaleList list) {
		ArrayList<Sale> sales = new ArrayList<Sale>();
		 sales = list.getSales();
		 Sale sale1 = sales.get(0);
		 Sale sale2 = sales.get(1);
		 int qty1 = sale1.getQty();
		 double discount1 = sale1.getDiscount();
		 double rate1 = sale1.getItem().getRate();
		 double total1 = (qty1 * rate1) - discount1 ;
		 double total1withTax = total1 + StdTaxCalc.getIST(total1) + StdTaxCalc.getFedTax(total1);
		 int qty2 = sale2.getQty();
		 double discount2 = sale2.getDiscount();
		 double rate2 = sale2.getItem().getRate();
		 double total2 = (qty2 * rate2) - discount2 ;
		 double total2withTax = total2 + StdTaxCalc.getIST(total2) + StdTaxCalc.getFedTax(total2);
		 double grandTotal = total1withTax + total2withTax;
		 System.out.println("The Grand Total is:"+" "+ grandTotal);
	}

}
