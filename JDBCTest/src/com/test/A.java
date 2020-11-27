package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class A {

	public static void main(String[] args) throws Exception {

		System.out.println("Stept - 1");
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Stept -  2");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		System.out.println("Stept -  3");
		
		Statement statement = con.createStatement();
		String sql = "insert into Employee (id,name) value (996622, 'Shweta')"; 
		
		int ii = statement.executeUpdate(sql);
		
		System.out.println("Total data inserted : "+ii);
		
	}

}
