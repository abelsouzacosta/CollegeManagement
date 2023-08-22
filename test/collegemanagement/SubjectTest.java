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
    
//    public SubjectTest() {
//    }
//    
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
//    
//    @Before
//    public void setUp() {
//    }
//    
//    @After
//    public void tearDown() {
//    }
//
//    /**
//     * Test of setName method, of class Subject.
//     */
//    @Test
//    public void testSetName() {
//        System.out.println("setName");
//        String name = "";
//        Subject instance = new Subject();
//        instance.setName(name);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getName method, of class Subject.
//     */
//    @Test
//    public void testGetName() {
//        System.out.println("getName");
//        Subject instance = new Subject();
//        String expResult = "";
//        String result = instance.getName();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setWorkLoad method, of class Subject.
//     */
//    @Test
//    public void testSetWorkLoad() {
//        System.out.println("setWorkLoad");
//        int work_load = 0;
//        Subject instance = new Subject();
//        instance.setWorkLoad(work_load);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getWorkLoad method, of class Subject.
//     */
//    @Test
//    public void testGetWorkLoad() {
//        System.out.println("getWorkLoad");
//        Subject instance = new Subject();
//        int expResult = 0;
//        int result = instance.getWorkLoad();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getId method, of class Subject.
//     */
//    @Test
//    public void testGetId() {
//        System.out.println("getId");
//        Subject instance = new Subject();
//        String expResult = "";
//        String result = instance.getId();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of enrollStudent method, of class Subject.
//     */
//    @Test
//    public void testEnrollStudent() {
//        System.out.println("enrollStudent");
//        Student student = null;
//        Subject instance = new Subject();
//        instance.enrollStudent(student);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getStudents method, of class Subject.
//     */
//    @Test
//    public void testGetStudents() {
//        System.out.println("getStudents");
//        Subject instance = new Subject();
//        ArrayList<String> expResult = null;
//        ArrayList<String> result = instance.getStudents();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
