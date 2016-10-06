/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;
import static org.junit.Assert.*;
import org.junit.*;
import org.mockito.*;
import Visitors.*;

/**
 *
 * @author simiao
 */
public class CitySim9002Test {
    @Mock
    CitySim9002 cs = Mockito.mock(CitySim9002.class);
    
    @Test
    public void testGenerateVisitor(){
        Student s = new Student(1);
        Mockito.when(cs.generateVisitor(0, 1)).thenCallRealMethod();
        assertEquals(cs.generateVisitor(0, 1).getType(),"Student");  
        Mockito.when(cs.generateVisitor(1, 1)).thenCallRealMethod();
        assertEquals(cs.generateVisitor(1, 1).getType(),"Professor"); 
        Mockito.when(cs.generateVisitor(2, 1)).thenCallRealMethod();
        assertEquals(cs.generateVisitor(2, 1).getType(),"BusinessPerson");
        Mockito.when(cs.generateVisitor(3, 1)).thenCallRealMethod();
        assertEquals(cs.generateVisitor(3, 1).getType(),"Blogger");
    }
    
}
