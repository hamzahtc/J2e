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
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author Hamza
 */
public class MainController implements Initializable {

    /**
     * Initializes the controller class.
     */
    public void ListMedecins(ActionEvent actionEvent) throws IOException {
        ViewLauncher.forward(actionEvent, "medecinFXML.fxml", this.getClass());
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
