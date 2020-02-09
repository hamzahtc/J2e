/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import projetcabmed.DBConnection;

/**
 *
 * @author Hamza
 */
public class RenvService {
    Connection conn = DBConnection.getConnection();
    public void addRenv(int id,Date jour_date, int id_client, int id_medecin){
       // Medecin medecine = new Medecin(id, version, titre, nom, prenom);
        try
		{
                        String sql = "INSERT INTO Renvs (id, jour_date, id_client, id_medecin) VALUES (?, ?, ?, ?)";
                        PreparedStatement statement = conn.prepareStatement(sql);
                        statement.setInt(1, id);
                        statement.setDate(2, (java.sql.Date) jour_date);
                        statement.setInt(3, id_client);
                        statement.setInt(4, id_medecin);
                        int rowsInserted = statement.executeUpdate();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
    }
    public void getRenvs() throws SQLException{
        String query = "Select * From renvs";
	Statement st = conn.createStatement();
        ResultSet rst = st.executeQuery(query);
			
	while(rst.next())
        {
	System.out.println(rst.getDate("jour_date")+" "+rst.getInt("id_client"));	
	}
    }
     public void deleteRenv(int id) throws SQLException{
            String sql = "delete from renvs where id = ?";
            PreparedStatement  st = conn.prepareStatement(sql);
            st.setInt(1, id);
            int affectedRecords = st.executeUpdate();
            System.out.println("Number of deleted records:- " + affectedRecords);
    }
}
