package com.pos;

import java.sql.SQLException;
import java.util.List;

public interface IDataRepository {
	
	public List<SaleItem> getSaleItems() throws Exception;

}
