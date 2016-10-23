/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visitors;

import CityLocs.Citylocations;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author simiao
 */

public class Visitor{
    private ArrayList<String> likeLocs;
    private int no;
    private String type;
    public Visitor(int no){
        this.no = no;
        this.likeLocs = new ArrayList<String>();
        //new line
        //this.iteration();
    }
    public ArrayList<String> getLocs(){
        return likeLocs;
    }
    public void addLocs(String loc){
        likeLocs.add(loc);
    }
    
    public void iteration(){
        int i = 0;
        Random random = new Random();
        int randomValue = random.nextInt(4);
        Citylocations citylocs = new Citylocations();
        //System.out.println(citylocs.locs);
        
        while(randomValue!=4){
            if(i==0){
                //int randomValue = random.nextInt(4); //[0,4)  0,1,2,3
                System.out.println("Visitor " + no + " is going to " + citylocs.locs.get(randomValue) + "!");
                isLiked(randomValue, citylocs);
            }else{
                if(citylocs.locs.size() <5){
                    citylocs.addLocations();
                }
                randomValue = random.nextInt(5); //0,1,2,3,4
                if (randomValue <4){
                    System.out.println("Visitor " + no + " is going to " + citylocs.locs.get(randomValue) + "!");
                    isLiked(randomValue, citylocs);
                }else {
                    System.out.println("Visitor "+ no +" has left the city.");
                    System.out.println("***");
                }
                
            }
            i++;
        }
    }
    //A method to see whether the randomly selected city is liked by the visitor
    public boolean isLiked(int randomValue, Citylocations citylocs){
        if (likeLocs.contains(citylocs.locs.get(randomValue))){
            System.out.println("Visitor " + no + " did like " + citylocs.locs.get(randomValue) + "!");
            return true;
        }else{
            System.out.println("Visitor " + no + " did not like " + citylocs.locs.get(randomValue) + ".");
            return false;
        }
        
    }
    
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return this.type;
    }


}