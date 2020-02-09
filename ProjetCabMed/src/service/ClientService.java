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
import projetcabmed.DBConnection;

/**
 *
 * @author Hamza
 */
public class ClientService {
    Connection conn = DBConnection.getConnection();
    public void addClient(int id,int version, String titre, String nom, String prenom){
       // Medecin medecine = new Medecin(id, version, titre, nom, prenom);
        try
		{
                        String sql = "INSERT INTO clients (id, version, titre, nom, prenom) VALUES (?, ?, ?, ?, ?)";
                        PreparedStatement statement = conn.prepareStatement(sql);
                        statement.setInt(1, id);
                        statement.setInt(2, version);
                        statement.setString(3, titre);
                        statement.setString(4, nom);
                        statement.setString(5, prenom);
                        int rowsInserted = statement.executeUpdate();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
    }
    public void getClients() throws SQLException{
        String query = "Select * From clients";
	Statement st = conn.createStatement();
        ResultSet rst = st.executeQuery(query);		
	while(rst.next())
        {
	System.out.println(rst.getString("prenom")+" "+rst.getString("nom"));	
	}
    }
    
     public void deleteClient(int id) throws SQLException{
            String sql = "delete from clients where id = ?";
            PreparedStatement  st = conn.prepareStatement(sql);
            st.setInt(1, id);
            int affectedRecords = st.executeUpdate();
            System.out.println("Number of deleted records:- " + affectedRecords);
    }
}
