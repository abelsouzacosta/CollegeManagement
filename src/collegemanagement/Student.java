/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collegemanagement;

import java.security.NoSuchAlgorithmException;


/**
 *
 * @author junior
 */
public class Student {
    private final String name;
    private final String code;
    private final String email;
    private final String cpf;
    
    public Student(String name, String code, String email, String cpf) {
        this.name = name;
        this.code = code;
        this.email = email;
        this.cpf = cpf;
    }
    
    public static Student createStudent(String name, String email, String cpf) throws NoSuchAlgorithmException {
        EmailValidator.isValid(email);
        String code = HashGenerator.generateSHA256(cpf + email);
        return new Student(name, code, email, cpf);
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getCode() {
        return this.code;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public String getCpf() {
        return this.cpf;
    }
    
}
