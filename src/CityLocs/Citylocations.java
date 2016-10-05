/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CityLocs;

import java.util.ArrayList;

/**
 *
 * @author simiao
 */
public class Citylocations {
    public ArrayList<String> locs = new ArrayList<>();
    public Citylocations(){
       // ArrayList locs = new ArrayList();
        locs.add("Squirrel Hill");
        locs.add("Downtown");
        locs.add("The Point");
        locs.add("The Cathedral of Learning");
        
    }
    public void addLocations(){
        locs.add("Leave the city");
    }
    
}
