package utility;

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
	
public static Connection getConnection() throws ClassNotFoundException, SQLException {
	Class.forName("oracle.jdbc.OracleDriver");
	
	Connection con = null;
	
	return con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl","SYSTEM","oracle");
}
}
//show your sql developer