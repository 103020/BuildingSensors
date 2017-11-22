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
    
    
    
    @Override
    public String toString(){
        return "time: " + time + " measurement: " + measurement;
    }
}
