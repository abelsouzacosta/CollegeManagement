/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package collegemanagement;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author junior
 */
public class SubjectTest {
    
    private Subject instance;
    private Student student;
    
    public SubjectTest() {}
    
    @Before
    public void setUp() {
        instance = new Subject("CS101", "Introduction to Computer Science", 120);
        student = new Student("CS90007", "Abel Souza", "mail@email.com", "0000000000");
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
    
    @Test
    public void testSetWorkLoad() {
        System.out.println("Testing method setWorkLoad(): should set a new work load");
        int new_work_load = 90;
        instance.setWorkLoad(new_work_load);
        assertEquals(new_work_load, instance.getWorkLoad());
    }
    
    @Test
    public void testEnrollStudent() {
        System.out.println("Testing method enrollStudent(): should enroll student");
        instance.enrollStudent(student);
        assertTrue(instance.getStudents().contains("CS90007"));
    }
    
    @Test
    public void testGetStudents() {
        System.out.println("Testing method getStudents(): should return an ArrayList containing two elements");
        Student another_student = new Student("CS3290", "Maria", "mail@mail.com", "90909090");
        instance.enrollStudent(student);
        instance.enrollStudent(another_student);
        assertEquals(2, instance.getStudents().size());
        assertTrue(instance.getStudents().contains("CS90007"));
        assertTrue(instance.getStudents().contains("CS3290"));
    }
    
    
}
