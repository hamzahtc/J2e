/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Medecin;
import projetcabmed.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Hamza
 */
public class MedecinService {
    Connection conn = DBConnection.getConnection();
    public void addMedecin(int id,int version, String titre, String nom, String prenom){
       // Medecin medecine = new Medecin(id, version, titre, nom, prenom);
        try
		{
                        String sql = "INSERT INTO medecins (id, version, titre, nom, prenom) VALUES (?, ?, ?, ?, ?)";
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
    public void getMedecins() throws SQLException{
        String query = "Select * From medecins";
	Statement st = conn.createStatement();
        ResultSet rst = st.executeQuery(query);
			
	while(rst.next())
        {
	System.out.println(rst.getInt("id")+" "+rst.getString("nom"));	
	}
    }
    public void deleteMedecin(int id) throws SQLException{
            String sql = "delete from medecins where id = ?";
            PreparedStatement  st = conn.prepareStatement(sql);
            st.setInt(1, id);
            int affectedRecords = st.executeUpdate();
            System.out.println("Number of deleted records:- " + affectedRecords);
    }
}
