package utility;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionManager {
	public static Connection getConnection() throws Exception {

		// method to load the properties of the connection from the file
		Properties properties = new Properties();
		properties = loadPropertiesFile();

		String driverString = properties.getProperty("driver");
		String urlString = properties.getProperty("url");
		String usernameString = properties.getProperty("username");
		String passwordString = properties.getProperty("password");

		// object to establish the connection
		Class.forName(driverString);
		Connection connection = null;
		connection = DriverManager.getConnection(urlString, usernameString, passwordString);
		return connection;
	}

	// method to load the properties from the file of the connection
	public static Properties loadPropertiesFile() throws Exception {
		Properties properties = new Properties();
		InputStream input = ConnectionManager.class.getClassLoader().getResourceAsStream("jdbc.properties");
		properties.load(input);
		input.close();
		return properties;
	}
}
