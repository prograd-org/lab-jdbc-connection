package controller;

import java.sql.Connection;

import utility.ConnectionManager;

public class Main {
	public static void main(String args[]) {
		
		Connection con=null;
		con=ConnectionManager.getConnection();
		if(con!=null) {
			System.out.println("Database connection established");
		}
		else
		{
			System.out.println("Check your connection");
		}
	}
}
