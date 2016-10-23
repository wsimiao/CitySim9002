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
 
    public Blogger(int no){
        super(no);
        this.setType("Blogger");
    }
}
