package utility;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class ConnectionManager {
	

	public static Properties loadPropertiesFile() throws Exception {
		Properties prop = new Properties();	
		InputStream in = ConnectionManager.class.getClassLoader().getResourceAsStream("jdbc.properties");
		prop.load(in);
		in.close(); 
		return prop;
	}
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException, IOException {
		
		FileReader reader = new FileReader("C:\\eclipse\\java\\lab-jdbc-connection\\src\\jdbc.properties");
		
		Properties p = new Properties();
		
		p.load(reader);
		String driver = p.getProperty("driver");
		String url = p.getProperty("url");
		String user = p.getProperty("username");
		String password = p.getProperty("password");
		
		//Load Driver
		
		Class.forName(driver);
		
		//Establish Connection
		
		Connection con = null;
		
		con = DriverManager.getConnection(url, user, password);
				
		return con;
		
		
	}
	
	
	
}
