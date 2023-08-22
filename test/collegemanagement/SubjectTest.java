/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package collegemanagement;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author junior
 */
public class SubjectTest {
    
    private Subject instance;
    
    public SubjectTest() {}
    
    @Before
    public void setUp() {
        instance = new Subject("CS101", "Introduction to Computer Science", 120);
    }
    
    @Test
    public void testGetId() {
        System.out.println("Testing method getId()");
        String expected = "CS101";
        String result = instance.getId();
        assertEquals(expected, result);
    }
    
    @Test
    public void testGetName() {
        System.out.println("Testing method getName()");
        String expected = "Introduction to Computer Science";
        String result = instance.getName();
        assertEquals(expected, result);
    }
    
    @Test
    public void testSetName() {
        System.out.println("Testing method setName()");
        String new_name = "Project Management";
        instance.setName(new_name);
        assertEquals(new_name, instance.getName());
    }
    
    @Test
    public void testGetWorkLoad() {
        System.out.println("Testing method getWorkLoad()");
        int expected = 120;
        int result = instance.getWorkLoad();
        assertEquals(expected, result);
    }
    
}
