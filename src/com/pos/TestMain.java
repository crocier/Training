package com.pos;

import java.util.ArrayList;
import java.util.List;

public class TestMain {

	public static void main(String[] args) {
		
//		SaleItem item1 = new SaleItem(7000, "Monitor");
//		SaleItem item2 = new SaleItem(5500, "Hard Disk");
//		
//		Sale sale1 = new Sale(2, 5, item1);
//		Sale sale2 = new Sale(5, 10, item2);
//		
//		SaleList list = new SaleList("18-08-2005", "Jennifer");
//		
//		ArrayList<Sale> sales = new ArrayList<>();
//		
//		sales.add(sale1);
//		sales.add(sale2);
//		
//		list.setSales(sales);
//		
//		BillingSys bill = new BillingSys();
//		
//		bill.generateBill(list);
		
		//Level4
        DataRepositoryFactory factory = new DataRepositoryFactory();
		
		IDataRepository repo = factory.create();	
		
		SaleItem[] items = new SaleItem[2];
		try {
			List<SaleItem> products = repo.getSaleItems();
			for(int i=0;i<products.size();i++) {
				SaleItem item = products.get(i);
				String description = item.getDes();
				double rate = item.getRate();
//				System.out.println("Description:"+" "+description);
//				System.out.println("Rate:"+" "+rate);
//				System.out.println("--------------------------");
				items[i] = new SaleItem(rate, description);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}		
		List<SaleItem> item = new ArrayList<SaleItem>();
		item.add(items[0]);
		item.add(items[1]);
		findItemsForUsers(item);
		Sale sale1 = new Sale(2, 5, items[0]);
		Sale sale2 = new Sale(5, 10, items[1]);
		
		SaleList list = new SaleList("18-08-2005", "Jennifer");
		
		ArrayList<Sale> sales = new ArrayList<>();
		
		sales.add(sale1);
		sales.add(sale2);
		
		list.setSales(sales);
		
//		System.out.println("Customer Name:"+" "+list.getCusName());
//		System.out.println("Date of purchase:"+list.getDtSale());
//		
//		BillingSys bill = new BillingSys();
//		
//		bill.generateBill(list);
	}
		//level5
		public static void findItemsForUsers(List<SaleItem> items) {
//			for(SaleItem i: items)
//				System.out.println(i.getDes()+":"+" "+i.getRate());
			//lambda foreach exp
			items.forEach(i->System.out.println(i.getDes()+":"+" "+i.getRate()));
			System.out.println("-----------------");
			System.out.println("Items which has rate less than 1000:");
//			for(SaleItem i: items) {
//				if(i.getRate()<1000) {
//					System.out.println(i.getDes()+":"+" "+i.getRate());
//				}
//			}
			CurrencyConvertorFunctionalInterface ref = (usd) -> {
				return usd * 74.14;
			};
			//lambda exp
			items.forEach(i -> {
				if(i.getRate()<1000) {
					System.out.println(i.getDes());
					System.out.println("In USD:"+" "+i.getRate());
					System.out.println("In Indian Rupee:"+" "+ref.currencyConvertor(i.getRate()));
					System.out.println("----------------------------");
				}
					
				
				
			});
			
			
			
			
		}

		
	
	
	}

