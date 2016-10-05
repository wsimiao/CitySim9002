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
            System.out.println(args[0]);
            String allVisitors[] = {"Student","Professor","BusinessPerson","Blogger"};
            Random random = new Random();
            for(int i = 0; i< seed; i++){
                int randomChoose = random.nextInt(4); //[0,4) 0,1,2,3
                if (randomChoose==0){
                    Student newStudent = new Student(i+1);
                }else if(randomChoose == 1){
                    Professor newProfessor = new Professor(i+1);
                }else if(randomChoose == 2){
                    BusinessPerson newBusinessPerson = new BusinessPerson(i+1);
                }else {
                    Blogger newBlogger = new Blogger(i+1);
                }
                
            }
        }
        else {
            System.out.println(errorMessage);
        }
        Student me = new Student(1);
        //me.addLocs("dkjfl");
        
        
        System.out.println( me instanceof Visitor);
        System.out.println(me.getLocs());
    }
}
