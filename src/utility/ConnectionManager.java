package utility;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionManager {

	public static Connection getConnection() throws SQLException, ClassNotFoundException, IOException {

		Properties prop = loadPropertiesFile();

		String driver = prop.getProperty("driver");

		Class.forName(driver);

		String url = prop.getProperty("url");
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");

		Connection con = DriverManager.getConnection(url, username, password);

		return con;

	}

	public static Properties loadPropertiesFile() throws IOException {

		Properties prop = new Properties();
		InputStream in = ConnectionManager.class.getClassLoader().getResourceAsStream("jdbc.properties");
		prop.load(in);
		in.close();
		return prop;

	}

}
