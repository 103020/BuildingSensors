/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buildingsensorsgui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

/**
 *
 * @author 103020
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private ListView<?> buildingList;
    @FXML
    private ListView<?> sensorList;
    @FXML
    private TextField textBuildingName;
    @FXML
    private TextField textBuildingAddresse;
    @FXML
    private Button buttonAddBuilding;
    @FXML
    private Button buttonGetDataFromAll;
    @FXML
    private Button buttonRemoveBuilding;
    @FXML
    private Button buttonGetMeasurement;
    @FXML
    private Button buttonHistory;
    @FXML
    private Button buttonAddSensor;
    @FXML
    private Button buttonRemoveSensor;
    @FXML
    private TextField sensorField;
    @FXML
    private TextField MeasurementField;
    @FXML
    private Button buttonAddMeasurement;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println(event.getSource());
        System.out.println("You clicked "+ event +"!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
