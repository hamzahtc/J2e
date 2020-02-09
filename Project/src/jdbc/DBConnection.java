package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection
{
	private static Connection conn;
	
	private DBConnection(){}
	
	public static Connection getConnection()
	{
		try
		{
			if(conn==null)
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cabinet_medicale?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC","root","");
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return conn;
	}
}