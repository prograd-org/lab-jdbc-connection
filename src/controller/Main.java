package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import utility.ConnectionManager;

public class Main {
	
	public static void main(String args[]) throws ClassNotFoundException, SQLException, IOException {
		
	//Object for the Connection
		
		Connection con = null;
		
	
		//Object for the ConnectionManager
		
		
		con = ConnectionManager.getConnection();
		
		if(con!= null)
			System.out.println("Connection Established");
		else
			System.out.println("Check your connection");
		
	}
}
