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

    public Student(int no){
        super(no);
        this.setType("Student");
        this.addLocs("Squirrel Hill");
        this.addLocs("Downtown");
        this.addLocs("The Point");
    }

}
