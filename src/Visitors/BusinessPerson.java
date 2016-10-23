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
public class BusinessPerson extends Visitor{
    public BusinessPerson(int no){
        super(no);
        this.setType("BusinessPerson");
        this.addLocs("Squirrel Hill");
        this.addLocs("Downtown");
    }
        
}
      