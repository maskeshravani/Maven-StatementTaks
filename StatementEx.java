package com.stateEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementEx {

	// Create Table
	public void createTable() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch197", "root", "root");
		Statement s = c.createStatement();

		s.execute("create table Student(id int, name varchar(30),age int, marks int) ");

		System.out.println("Table Created Succesfully....");
		c.close();
	}

	// Insert Data
	public void insertData() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch197", "root", "root");
		Statement s = c.createStatement();

		s.executeUpdate("insert into Student values(5, 'Samrudhhi', 20, 87)");

		System.out.println("Data Inserted Succesfully....");
		c.close();
	}

	// Update Data
	public void updateData() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch197", "root", "root");
		Statement s = c.createStatement();

		s.executeUpdate("update Student set name = 'Samruddhi' where id = 2");

		System.out.println("Data Updated Succesfully....");
		c.close();
	}

	// Delete Data
	public void deleteData() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch197", "root", "root");
		Statement s = c.createStatement();

		s.executeUpdate("delete from Student Where id = 5");
		System.out.println("Data Deleted Succesfully....");
	}

	// Fetch Data
	public void fetchData() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch197", "root", "root");
		Statement s = c.createStatement();

		ResultSet rs = s.executeQuery("select * from Student");

		while (rs.next()) {
			System.out.println("Id: " + rs.getInt(1) + " Name: " + rs.getString(2) + " Age: " + rs.getInt(3)
					+ " Marks: " + rs.getInt(4));
		}

	}
}
