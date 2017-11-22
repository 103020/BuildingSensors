/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buildingsensors;

import java.util.ArrayList;

/**
 *
 * @author laurabrinkholmjustesen
 */
public class Building {
    // Data fields
    private String name;
    private String address;
    private ArrayList<Sensor> sensors;
    
    // This constructor creates a Building object with the specified name and
    // address.
    public Building(String name, String address) {
        this.name = name;
        this.address = address;
    }
    
    // This constructor creates a Building object with the specified name,
    // address, and sensors
    public Building(String name, String address, ArrayList<Sensor> sensors) {
        this(name, address);
        this.sensors = sensors;
    }
    
    // This method adds a sensor with an initial reading to the building
    public void addSensor(int sensorID, Reading initialReading) {
        Sensor sensor = new Sensor(sensorID, initialReading);
        this.sensors.add(sensor);
    }
    
    // This method adds a sensor without an initial reading to the building
    public void addSensor(int sensorID) {
        Sensor sensor = new Sensor(sensorID);
        this.sensors.add(sensor);
    }
    
    // This method removes a sensor from the building
    public void removeSensor(Sensor sensor) {
        this.sensors.remove(sensor);
    }
    
    // This method returns a String description of the building
    @Override
    public String toString() {
        String returnString = "Name: " + this.name + "\nAddress: " + this.address;
        return returnString;
    }
    
    // Get measurements from sensors
    
    // This method returns the name of the building
    public String getName() {
        return this.name;
    }
    
    // This method sets the name of the building
    public void setName(String name) {
        this.name = name;
    }
    
    // This method returns the address of the building
    public String getAddress() {
        return this.address;
    }
    
    // This method sets the address of the building
    public void setAddress(String address) {
        this.address = address;
    }
}
