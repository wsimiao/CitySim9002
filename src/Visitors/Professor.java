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
public class Professor extends Visitor{
    public Professor(int no){
        super(no);
        this.setType("Professor");
        this.addLocs("Squirrel Hill");
        this.addLocs("Downtown");
        this.addLocs("The Point");
        this.addLocs("The Cathedral of Learning");
        //System.out.println("Visitor " + no + " is a Professor.");
    }
    
}
