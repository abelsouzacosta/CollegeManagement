/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package collegemanagement;


import java.security.NoSuchAlgorithmException;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author junior
 */
public class StudentTest {
    
   private Student student;
   private String validName = "Test";
   private String validEmail = "mail@gmail.com";
   private String validCpf = "90909090909";
   
   @Before
   public void setUp() throws NoSuchAlgorithmException {
       this.student = Student.createStudent(validName, validEmail, validCpf);
   }
   
   @Test
   public void shouldThrowExceptionIfEmailIsInvalid() throws NoSuchAlgorithmException {
       assertThrows(IllegalArgumentException.class, () -> {
           Student.createStudent("Test", "mail@test.com", "90909090909");
       });
   }
   
   @Test
   public void shouldInstantiateStudentProperly() {
       assertFalse(this.student.getCode().trim().isEmpty());
       assertEquals(validName, this.student.getName());
       assertEquals(validEmail, this.student.getEmail());
       assertEquals(validCpf, this.student.getCpf());
   }
    
}
