package com.stateEx;

import java.sql.SQLException;

public class StateMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		StatementEx s = new StatementEx();
		//s.createTable();
		//s.insertData();
		//s.updateData();
		//s.deleteData();
		s.fetchData();
	}

}
