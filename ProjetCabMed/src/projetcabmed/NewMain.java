/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetcabmed;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import service.MedecinService;
/**
 *
 * @author Hamza
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection conn = DBConnection.getConnection();
		
		try
		{
                    MedecinService medecinService = new MedecinService();
                    //medecinService.addMedecin(4, 2, "ee", "raar", "zaa");
                    //medecinService.getMedecins();
                    medecinService.deleteMedecin(1);
//			String query = "Select * From medecins";
//			Statement st = conn.createStatement();
//			ResultSet rst = st.executeQuery(query);
//			
//			while(rst.next())
//			{
//				System.out.println(rst.getString("id")+" "+rst.getString("nom"));	
//			}
                       /* String sql = "INSERT INTO medecins (id, version, titre, nom, prenom) VALUES (?, ?, ?, ?, ?)";
 
                        PreparedStatement statement = conn.prepareStatement(sql);
                        statement.setString(1, "1");
                        statement.setString(2, "1");
                        statement.setString(3, "ates");
                        statement.setString(4, "hatoch");
                        statement.setString(5, "hamza");

                        int rowsInserted = statement.executeUpdate();
                        if (rowsInserted > 0) {
                            System.out.println("A new user was inserted successfully!");
                        }*/
                        
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
