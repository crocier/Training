package com.pos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JDBCDataRepository implements IDataRepository {
	
	public List<SaleItem> getSaleItems() throws Exception{
		
		List<SaleItem> sales = new ArrayList<>();

		String query = "select description,rate from pos.salelist";
		
		Connection conn = DBConnect.getConnection();
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(query);
		while(rs.next()) {
		String des = rs.getString("description");
		double rate = rs.getDouble("rate");
		SaleItem items = new SaleItem(rate, des);
		sales.add(items);
		}
		st.close();
		conn.close();
		
		return sales;
		
		
		
		
	}

}
