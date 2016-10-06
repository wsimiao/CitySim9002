/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visitors;
import CityLocs.*;
import java.util.ArrayList;
import java.util.Random;
import org.junit.Assert;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;
/**
 *
 * @author simiao
 */
public class VisitorTest {
    
    //test that the student will like the first three locations
    //true should be returned for the three locations and false for the forth location
    @Test
    public void testStudentLike(){
        Visitor v = new Student(1);
        Random rand = new Random();
        Citylocations citylocs = new Citylocations();
        assertTrue(v.isLiked(0, citylocs));
        assertTrue(v.isLiked(1, citylocs));
        assertTrue(v.isLiked(2, citylocs));
        
    }
    
    //test that the locations student like is {"Squirrel Hill", "DownTown", "The Point"}
    @Test
    public void testGetLocs(){
        Visitor v = new Student(1);
        ArrayList<String> result = v.getLocs();
        String[] expResult = {"Squirrel Hill", "Downtown", "The Point"};
        assertArrayEquals(result.toArray(), expResult);
        
    }
    
    
    
}
