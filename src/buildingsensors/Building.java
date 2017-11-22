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
    
    // This method returns the name of the building
    public String getName() {
        return this.name;
    }
}
