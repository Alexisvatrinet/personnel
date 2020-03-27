package jdbc;

public class Pont {
	 
	private static String driver ="mysql",
			driverClassName = "com.mysql.cj.jdbc.Driver",
			host = "localhost", 
			port ="3306",
			database ="ppe",
			user = "root",
			password = "";

	static String getUrl() 
	{
		return "jdbc:" + driver + "://" + host + "/" + database ;
	}

	static String getDriverClassName()
	{
		return driverClassName;
	}

	static String getUser() 
	{
		return user;
	}

	static String getPassword() 
	{
		return password;
	}
}
