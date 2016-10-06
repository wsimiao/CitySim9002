/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visitors;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author simiao
 */
public class StudentTest {
    
    @Test
    public void testStudentType(){
        Visitor v = new Student(1);
        String expResult = "Student";
        String result = v.getType();
        assertEquals(expResult, result);
    }
    
}
