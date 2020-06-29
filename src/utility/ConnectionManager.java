package utility;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionManager {
	public static Connection getConnection() {
		Connection con = null;
		Properties properties;
		try {
			properties = ConnectionManager.loadPropertiesFile() ;
		
		//take the required properties out of properties object
		final String driver,url,username,password;
		driver = properties.getProperty("driver");
		url = properties.getProperty("url");
		username = properties.getProperty("username");
		password = properties.getProperty("password");
		//load the driver
		Class.forName(driver);
		//get the connection
		con = DriverManager.getConnection(url, username, password);
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

	public static Properties loadPropertiesFile() throws Exception {
		Properties prop = new Properties();
		InputStream in = ConnectionManager.class.getClassLoader().getResourceAsStream("jdbc.properties");
		prop.load(in);
		in.close();
		return prop;
	}
}
