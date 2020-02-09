/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import service.MedecinService;

/**
 * FXML Controller class
 *
 * @author Hamza
 */
public class AddMedecinFXMLController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private TextField id;
@FXML
    private TextField version;
@FXML
    private TextField titre;
@FXML
    private TextField nom;
@FXML
    private TextField prenom;
    /**
     * Initializes the controller class.
     */
    MedecinService medecinService = new MedecinService();
public void addMedecin(ActionEvent actionEvent) throws IOException {
    medecinService.addMedecin(Integer.parseInt(id.getText()),Integer.parseInt(version.getText()), titre.getText(), nom.getText(), prenom.getText());
    ViewLauncher.forward(actionEvent, "medecinFXML.fxml", this.getClass());
}
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
