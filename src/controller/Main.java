package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import utility.ConnectionManager;

public class Main {
	public static void main(String args[]) throws ClassNotFoundException, SQLException, IOException {
		Connection con;
		con=ConnectionManager.getConnection();
		if(con!=null)
			System.out.println(" Connection established");
		else
			System.out.println("Check your connection");
		
		
	}
}
