package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnectionTest
{
	public static void main(String [] args)
	{
		Connection conn = DBConnection.getConnection();
		
		try
		{
			String query = "Select * From student";
			Statement st = conn.createStatement();
			ResultSet rst = st.executeQuery(query);
			
			while(rst.next())
			{
				System.out.println(rst.getString("id")+" "+rst.getString("name"));	
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally
		{
			try{
				conn.close();
			}catch(SQLException ex)
			{
				ex.printStackTrace();
			}
		}
		
	}
}