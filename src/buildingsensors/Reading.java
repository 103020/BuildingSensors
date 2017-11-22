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
     * Constructor for measurement, id and type
     */
    public Reading(double measurement, int id, boolean type) {
        this.measurement = measurement;
        this.id = id;
        this.type = type;
    }

    public Date getTime() {
        return time;
    }

    public double getMeasurement() {
        return measurement;
    }

    public int getId() {
        return id;
    }

    public boolean isType() {
        return type;
    }
    
    @Override
    public String toString(){
        return "time: " + time + " measurement: " + measurement;
    }
}
