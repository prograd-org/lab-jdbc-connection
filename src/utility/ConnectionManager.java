package utility;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionManager {
	
	public static Properties loadPropertiesFile() throws IOException {
		Properties prop = new Properties();
		InputStream in = ConnectionManager.class.getClassLoader().getResourceAsStream("jdbc.properties");
		prop.load(in);
		in.close();
		return prop;
	}
	
	public static Connection getConnection() throws IOException, ClassNotFoundException, SQLException {
		Properties properties = new Properties();
		properties = loadPropertiesFile();
		
		String driver,url,username,password;
		
		driver = properties.getProperty("driver");
		url = properties.getProperty("url");
		password = properties.getProperty("password");
		username  = properties.getProperty("username");
		
		Class.forName(driver);
		
		Connection con = DriverManager.getConnection(url,username,password);
		
		return con;
		
	}
}
