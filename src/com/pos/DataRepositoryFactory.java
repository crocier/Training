package com.pos;

public class DataRepositoryFactory {
	
	
	public IDataRepository create() {
		
		return new JDBCDataRepository();
	}

}
