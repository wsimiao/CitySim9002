/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

import Domain.Validator;
import Visitors.*;
import java.util.Random;

/**
 *
 * @author AsphaltPanthers
 */
public class CitySim9002 {
    public static String errorMessage = "Please enter one integer argument, seed";
    
    public static void main(String[] args) {
        if (new Validator().validateArguments(args)) {
            int seed = Integer.parseInt(args[0]);  
            System.out.println("Welcome to CitySim! Your seed is "+ seed + ".");
            
            Random random = new Random(seed);
            CitySim9002 cs = new CitySim9002();
            cs.generateFiveVisitors(random);

        }
        else {
            System.out.println(errorMessage);
        }

        
    }
    
    public Visitor generateVisitor(int randomChoose, int no){
        Visitor v;
       if(randomChoose == 0){
           System.out.println("Visitor " + no +" is a Student.");
           v = new Student(no);
           v.iteration();
       }else if(randomChoose ==1){
           System.out.println("Visitor " + no +" is a Professor.");
           v = new Professor(no);
           v.iteration();
       }else if(randomChoose ==2){
           System.out.println("Visitor " + no +" is a Business Person.");
           v = new BusinessPerson(no);
           v.iteration();
       }else if(randomChoose ==3){
           System.out.println("Visitor " + no +" is a Blogger.");
           v = new Blogger(no);
           v.iteration();
       }else{
           v=null;
       }
       return v;
    }
    
    public void generateFiveVisitors(Random rand){
        Visitor visitor = null;
        for (int i=1; i<=5; i++){
            visitor = generateVisitor(rand.nextInt(4), i);
        }
    }
    
           
    
}
