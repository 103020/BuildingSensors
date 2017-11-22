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
 * @author 103020
 */
public class Sensor {
    private static int id;
    private ArrayList<Reading> rList;

    /**
     * constructor
     * @param id 
     */
    public Sensor(int id){
        this.id = id;
    }
    /**
     * constructor
     * @param id
     * @param r if there is a reading
     */
    public Sensor(int id, Reading r){
        this.id = id;
        setReading(r);
    }
    /**
     * get the latest reading
     * @return 
     */
    public Reading getReading() {
        return rList.get(rList.size()-1);
    }

    /**
     * set a reading
     * @param r 
     */
    public void setReading(Reading r) {
        this.rList.add(r);
    }
    
    /**
     * returns a list with all the readings
     * @return 
     */
    public ArrayList<Reading> getHistory(){
        return this.rList;
    }
    
    /**
     * 
     */
    public void printHistory(){
        for(Reading r : rList){
            System.out.println(r.toString());
        }
    }
}
