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
public class CreneauService {
    Connection conn = DBConnection.getConnection();
    public void addCreneau(int id,int version, int hdebut, int mdebut, int hfin, int mfin, int id_medecin){
       // Medecin medecine = new Medecin(id, version, titre, nom, prenom);
        try
		{
                        String sql = "INSERT INTO medecins (id, version, titre, nom, prenom) VALUES (?, ?, ?, ?, ?, ?, ?)";
                        PreparedStatement statement = conn.prepareStatement(sql);
                        statement.setInt(1, id);
                        statement.setInt(2, version);
                        statement.setInt(3, hdebut);
                        statement.setInt(4, mdebut);
                        statement.setInt(5, hfin);
                        statement.setInt(6, mfin);
                        statement.setInt(7, id_medecin);
                        
                        
                        int rowsInserted = statement.executeUpdate();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
    }
    public void getMedecins() throws SQLException{
        String query = "Select * From creneaux";
	Statement st = conn.createStatement();
        ResultSet rst = st.executeQuery(query);
			
	while(rst.next())
        {
	System.out.println(rst.getInt("id")+" "+rst.getInt("nom"));	
	}
    }
     public void deleteCreneau(int id) throws SQLException{
            String sql = "delete from creneaux where id = ?";
            PreparedStatement  st = conn.prepareStatement(sql);
            st.setInt(1, id);
            int affectedRecords = st.executeUpdate();
            System.out.println("Number of deleted records:- " + affectedRecords);
    }
}
