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
public class Sensor {
    private static int id;
    private ArrayList<Reading> rList;

    public Sensor(int id){
        this.id = id;
    }
    public Sensor(int id, Reading r){
        this.id = id;
        setReading(r);
    }
    
    public Reading getReading() {
        return rList.get(rList.size()-1);
    }

    public void setReading(Reading r) {
        this.rList.add(r);
    }
    
    public ArrayList<Reading> getHistory(){
        return this.rList;
    }
}
