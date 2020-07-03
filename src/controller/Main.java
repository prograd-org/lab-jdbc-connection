package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import utility.ConnectionManager;

public class Main {
	public static void main(String args[]) throws SQLException, ClassNotFoundException {
		// Fill your code
		
		Class.forName("oracle.jdbc.OracleDriver");
		
		Connection con = null;
		
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl","SYSTEM","oracle");
		
		if(con != null) {
			System.out.println("Connection Established");
		}
		else {
			System.out.println("Check your connection!!!");
		}
		
		con.close();
	}
	
}
