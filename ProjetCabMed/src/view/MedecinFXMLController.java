/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.Medecin;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import projetcabmed.DBConnection;
import service.MedecinService;

/**
 * FXML Controller class
 *
 * @author Hamza
 */
public class MedecinFXMLController implements Initializable {
@FXML
TableView tableView = new TableView();

     public void addMedecin(ActionEvent actionEvent) throws IOException {
        ViewLauncher.forward(actionEvent, "addMedecinFXML.fxml", this.getClass());
    }
     public void deleteMedecin(ActionEvent actionEvent) throws IOException {
        Medecin selectedItem = (Medecin) tableView.getSelectionModel().getSelectedItem();
        tableView.getItems().remove(selectedItem);
     }
     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
            Connection conn = DBConnection.getConnection();

        TableColumn<String, Medecin> column1 = new TableColumn<>("nom");
        column1.setCellValueFactory(new PropertyValueFactory<>("nom"));
        TableColumn<String, Medecin> column2 = new TableColumn<>("prenom");
        column2.setCellValueFactory(new PropertyValueFactory<>("prenom"));
        tableView.getColumns().addAll(column1, column2);
        String query = "Select * From medecins";
        try{
            Statement st = conn.createStatement();
        ResultSet rst = st.executeQuery(query);
			
	while(rst.next())
        {
	//System.out.println(rst.getString("nom")+" "+rst.getString("prenom"));
        tableView.getItems().add(new Medecin(rst.getString("nom"), rst.getString("prenom")));
	}
        }catch(Exception e)
		{
			e.printStackTrace();
		}
	
       /* tableView.getItems().add(new Medecin("John", "Doe"));
        tableView.getItems().add(new Medecin("Jane", "Deer"));
*/
    }    
    
}
