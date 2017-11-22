/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buildingsensors;

import java.util.Date;

/**
 *
 * @author laurabrinkholmjustesen
 */
public class Reading {
    // Data fields
    private Date time;
    private double measurement;
    private int id;
    private boolean type;
    
    /**
     * Constructor for measurement
     * @param measurement 
     */
    public Reading(double measurement) {
        this.measurement = measurement;
    }
    
    /**
     * Constructor for id
     * @param id 
     */
    public Reading(int id) {
        this.id = id;
    }
    
    /**
     * Constructor for type
     * @param type 
     */
    public Reading(boolean type) {
        this.type = type;
    
    }
    
    @Override
    public String toString(){
        return "time: " + time + " measurement: " + measurement;
    }
}
