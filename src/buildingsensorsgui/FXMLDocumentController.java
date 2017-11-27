/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buildingsensorsgui;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
    private ListView<buildingsensors.Building> buildingList;
    @FXML
    private ListView<buildingsensors.Sensor> sensorList;
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
        if (event.getSource() == buttonAddBuilding) {
            System.out.println(textBuildingAddresse.getText() + " " + textBuildingName.getText());
            if (!textBuildingName.getText().isEmpty() || !textBuildingAddresse.getText().isEmpty()) {
                /*ArrayList alist = new ArrayList();
                alist.add(new buildingsensors.Building(textBuildingName.getText(), textBuildingAddresse.getText()));
                ObservableList<String> oList = FXCollections.observableArrayList("First word","Second word", "Third word", "Etc.");
                ListView<String> listView = new ListView<String>(oList);*/
                buildingList.getItems().add(new buildingsensors.Building(textBuildingName.getText(), textBuildingAddresse.getText()));
                //new buildingsensors.Building(textBuildingName.getText(), textBuildingAddresse.getText())
            }
        } else if (event.getSource() == buttonAddMeasurement) {
            
        } else if (event.getSource() == buttonAddSensor) {
            
        } else if (event.getSource() == buttonGetDataFromAll) {
            
        } else if (event.getSource() == buttonGetMeasurement) {
            
        } else if (event.getSource() == buttonHistory) {
            
        } else if (event.getSource() == buttonRemoveBuilding) {
            
        } else if (event.getSource() == buttonRemoveSensor) {
            
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
