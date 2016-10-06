/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visitors;

/**
 *
 * @author simiao
 */
public class Blogger extends Visitor{
//    @Override
//    public void like(){
//        System.out.print("Blogger");
//    }
//    
    public Blogger(int no){
        super(no);
        this.setType("Blogger");
        //this.addLocs("")
        //System.out.println("Visitor " + (no+1) + " is a Blogger.");
    }
}
