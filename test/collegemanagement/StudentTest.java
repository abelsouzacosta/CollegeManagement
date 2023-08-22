/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package collegemanagement;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author junior
 */
public class StudentTest {
    
    private Student student;
    
    public StudentTest() {
        
    }
    
    @Before
    public void setUp() {
        student = new Student("STU90007", "Abel Souza", "mail@mail.com", "9090909090");
    }
    
    @Test
    public void testGetName() {
        System.out.println("Testing method getName(): should return the name of the student");
        String result = student.getName();
        assertEquals("Abel Souza", result);
    }
    
    @Test
    public void testSetName() {
        System.out.println("Testing method setName(): should set a name to the Student");
        String new_name = "Maria";
        student.setName(new_name);
        assertEquals(new_name, student.getName());
    }
    
    @Test
    public void testGetEmail() {
        System.out.println("Testing method getEmail(): should return the Student's email address");
        String expected = "mail@mail.com";
        assertEquals(expected, student.getEmail());
    }
    
    @Test
    public void testSetEmail() {
        System.out.println("Testing method setEmail(): should set a new email address to the student");
        String new_address = "email@mail.com";
        student.setEmail(new_address);
        assertEquals(new_address, student.getEmail());
    }
    
    @Test
    public void testGetCpf() {
        System.out.println("Testing method getCpf(): should return the student's cpf");
        String expected = "9090909090";
        assertEquals(expected, student.getCpf());
    }
    
    @Test
    public void testSetCpf() {
        System.out.println("Testing method setCpf(): should set a new cpf to the student");
        String new_cpf = "00000000000";
        student.setCpf(new_cpf);
        assertEquals(new_cpf, student.getCpf());
    }
    
    @Test
    public void testGetId() {
        System.out.println("Testing method getId(): should return the id of the student");
        String expected = "STU90007";
        String result = student.getId();
        assertEquals(expected, result);
    }
    
    @Test
    public void testStudentCannotEnrollToSameSubjectTwice() {
        System.out.println("Testing method enrollToSubject(): should enroll the student just one time");
        Subject subject = new Subject("CS101", "Introduction to Computer Science", 120);
        student.enrollToSubject(subject);
        student.enrollToSubject(subject);
        assertEquals(1, student.getSubjects().size());
    }
    
    @Test
    public void testGetSubjects() {
        System.out.println("Testing method getSubjects(): should return all subjects");
        Subject subject = new Subject("CS101", "Introduction to Computer Science", 120);
        student.enrollToSubject(subject);
        ArrayList<String> result = student.getSubjects();
        assertTrue(result.contains("CS101"));
    }
    
}
