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
            int seed = Integer.parseInt(args[0]);  //返回你输入 java CitySim900 n 中的n
            System.out.println("Welcome to CitySim! Your seed is "+ seed);
            //String allVisitors[] = {"Student","Professor","BusinessPerson","Blogger"};
            Random random = new Random();
            for(int i = 1; i<= seed; i++){
                int randomChoose = random.nextInt(4); //[0,4) 0,1,2,3
                if (randomChoose==0){
                    System.out.println("Visitor " + i +" is a student");
                    Student newStudent = new Student(i);
                }else if(randomChoose == 1){
                    System.out.println("Visitor " + i +" is a professor");
                    Professor newProfessor = new Professor(i);
                }else if(randomChoose == 2){
                    System.out.println("Visitor " + i +" is a business person");
                    BusinessPerson newBusinessPerson = new BusinessPerson(i);
                }else {
                    System.out.println("Visitor " + i +" is a blogger");
                    Blogger newBlogger = new Blogger(i);
                }
                
            }
        }
        else {
            System.out.println(errorMessage);
        }
        //Student me = new Student(1);
        //me.addLocs("dkjfl");
        
    }
}
