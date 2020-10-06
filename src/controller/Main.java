package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import utility.ConnectionManager;

public class Main {
	public static void main(String args[]) throws SQLException, ClassNotFoundException, IOException {

		Connection con;
		con = ConnectionManager.getConnection();
		// Fill your code
		if (con != null)
			System.out.println("Connection Established");
		else
			System.out.println("Check your connection");
	}
}
