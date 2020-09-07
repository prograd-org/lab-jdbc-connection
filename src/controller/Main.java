package controller;

import java.sql.Connection;

import utility.ConnectionManager;

public class Main {
	public static void main(String args[]) throws Exception {

		// Fill your code
		Connection connection = null;
		connection = ConnectionManager.getConnection();
		if (connection != null) {
			System.err.println("Connection Established");
		} else {
			System.out.println("Check Your Connection");
		}
	}
}
