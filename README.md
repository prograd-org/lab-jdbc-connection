![Image description](https://i1.faceprep.in/ProGrad/face-logo-resized.png)

# ProGrad Lab | ProGrad Premier League


## Progression 1:

1. **Create a class called as  `ConnectionManager` inside the utility package.**
2. **Create a method called public static Connection getConnection() which returns a connection object.** 
3. **Get the connection properties from jdbc.properites file which is given below inside the NOTE.**
4. **Use the public static Properties loadPropertiesFile() to load the jdbc properties from the jdbc.properties file.**



## Progression 2:

1. **Create a class called as  `Main` with main method inside the controller package.**
2. **Create an object for the Connection { java.sql.Connection }.**
3. **Call the getConnection() method.**
4. **Display "Connection established" if the connection is not equal to null else display "Check your connection".**


### Note:

Use the below code to retreive the connection details from jdbc.properties to establish connection
```
public static Properties loadPropertiesFile() throws Exception {
	Properties prop = new Properties();	
	InputStream in = ConnectionManager.class.getClassLoader().getResourceAsStream("jdbc.properties");
	prop.load(in);
	in.close(); 
	return prop;
}
```
Create a file called as jdbc.properites. To create a file right click on the application - new - file - name the file as jdbc.properties.
```
jdbc.properties
#JDBC properties entry for MYSQL server
driver = oracle.jdbc.OracleDriver
url=jdbc:oracle:thin:@localhost:1521:xe
username=your_username
password=your_password

```

**Sample Output**

> List of all skills 
> 1) All Rounder 
> 2) Batting 
> 3) Bowling 
> 4) Wicket Keeping Batting 
