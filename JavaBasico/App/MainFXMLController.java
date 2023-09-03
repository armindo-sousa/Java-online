/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainApp;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author odina
 */
public class MainFXMLController implements Initializable {

    @FXML
    private RadioButton Rmasculino;
    @FXML
    private RadioButton Rfeminino;
    @FXML
    private TextField tfNome;
    @FXML
    private TextField tfPeso;
    @FXML
    private TextField tfAltura;
    @FXML
    private TextField tfIdade;
    @FXML
    private Button btnLimpar;
    @FXML
    private Button btnCalcular;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleBtnLimpar(ActionEvent event) {
        tfNome.setText("Nome completo: ");
        tfPeso.setText(null);
        tfAltura.setText(null);
        
    }

    @FXML
    private void handleBtnCalcular(ActionEvent event) {
    }
    
}
