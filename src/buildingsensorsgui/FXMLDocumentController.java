/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buildingsensorsgui;

import buildingsensors.Reading;
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
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

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
    private GridPane disabledbelGrid_1;
    @FXML
    private GridPane disabledbelGrid_2;
    @FXML
    private GridPane disabledbelGrid_3;
    @FXML
    private TextField MeasurementIdField;
    @FXML
    private ToggleGroup sensorToggle;
    @FXML
    private RadioButton temperaturToggle;
    @FXML
    private TextArea textArea;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (event.getSource() == buttonAddBuilding) {
            //System.out.println(textBuildingAddresse.getText() + " " + textBuildingName.getText());
            if (!textBuildingName.getText().isEmpty() || !textBuildingAddresse.getText().isEmpty()) {
                //adds a building to the listview
                buildingList.getItems().add(new buildingsensors.Building(textBuildingName.getText(), textBuildingAddresse.getText()));
            }
        } else if (event.getSource() == buttonAddMeasurement) {
            boolean temperatur;
            if (temperaturToggle.isSelected()) {
                temperatur = true;
            } else {
                temperatur = false;
            }
            try {
                sensorList.getSelectionModel().getSelectedItem().setReading(new Reading(Double.parseDouble(MeasurementField.getText()),Integer.parseInt(MeasurementIdField.getText()),temperatur));
            } catch(NumberFormatException n) {
                n.printStackTrace();
                return;
            }
        } else if (event.getSource() == buttonAddSensor) {
            try {
                buildingList.getSelectionModel().getSelectedItem().addSensor(Integer.parseInt(sensorField.getText()));
            } catch(NumberFormatException n) {
                n.printStackTrace();
                return;
            }
            sensorList.getItems().clear();
            sensorList.getItems().addAll(buildingList.getSelectionModel().getSelectedItem().getSensors());
        } else if (event.getSource() == buttonGetDataFromAll) {
            
        } else if (event.getSource() == buttonGetMeasurement) {
            textArea.appendText(sensorList.getSelectionModel().getSelectedItem().getReading().toString()+"\n");
            //System.out.println(sensorList.getSelectionModel().getSelectedItem().getReading());
        } else if (event.getSource() == buttonHistory) {
            for (Reading readings : sensorList.getSelectionModel().getSelectedItem().getHistory()){
                textArea.appendText(readings.toString()+"\n");
                //System.out.println(readings);
            }
        } else if (event.getSource() == buttonRemoveBuilding) {
            buildingList.getItems().remove(buildingList.getSelectionModel().getSelectedItem());
            sensorList.getItems().clear();
        } else if (event.getSource() == buttonRemoveSensor) {
            
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        disabledbelGrid_1.setDisable(true);
        disabledbelGrid_2.setDisable(true);
        disabledbelGrid_3.setDisable(true);
        // TODO
        
    }

    @FXML
    private void handleMouseClickedActionBuildings(MouseEvent event) {
        //System.out.println("clicked on " + buildingList.getSelectionModel().getSelectedItem());
        if (buildingList.getSelectionModel().getSelectedItem() == null) {
            disabledbelGrid_1.setDisable(true);
            disabledbelGrid_2.setDisable(true);
            disabledbelGrid_3.setDisable(true);
        } else {
            disabledbelGrid_1.setDisable(false);
            disabledbelGrid_2.setDisable(false);
            disabledbelGrid_3.setDisable(true);
            buttonGetMeasurement.setDisable(true);
            buttonHistory.setDisable(true);
            buttonRemoveSensor.setDisable(true);
            sensorList.getItems().clear();
            if (buildingList.getSelectionModel().getSelectedItem().getSensors().size() != 0) {
                sensorList.getItems().addAll(buildingList.getSelectionModel().getSelectedItem().getSensors());
            }
            
        }
    }

    @FXML
    private void handleMouseClickedActionSensors(MouseEvent event) {
        if (sensorList.getSelectionModel().getSelectedItem() == null) {
            disabledbelGrid_3.setDisable(true);
        } else {
            disabledbelGrid_2.setDisable(false);
            buttonGetMeasurement.setDisable(false);
            buttonHistory.setDisable(false);
            buttonRemoveSensor.setDisable(false);
            disabledbelGrid_3.setDisable(false);
        }
    }
    
    
}
