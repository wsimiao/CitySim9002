/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visitors;

import java.util.ArrayList;
import CityLocs.*;
import java.util.Random;
/**
 *
 * @author simiao
 */
public class Student extends Visitor{
    //private ArrayList<String> likeLocs;
    public Student(int no){
        super(no);
        //likeLocs.add("");
        this.addLocs("Squirrel Hill");
        this.addLocs("Downtown");
        this.addLocs("The Point");
    }

//    @Override
////    public void like(){
////        //System.out.print("Student");
////        likeLocs.add("Squirrel Hill");
////        likeLocs.add("Downtown");
////        likeLocs.add("The Point");
////        
////    }
////    
    
    
//    public void iteration(){
//        Citylocations citylocs = new Citylocations();
//        int i = 0;
//        if(i>0){
//            citylocs.addLocations();
//        }
//        Random random = new Random();
//        int randomValue = -1;
//        while(randomValue !=4){
//            if(i==0){
//                randomValue = random.nextInt(3);
//                System.out.println("");
//            }
//        }
//    }
       
}
