/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collegemanagement;

import java.util.ArrayList;

/**
 *
 * @author junior
 */
public class Student implements StudentAcademicActions {
    private String name;
    private String email;
    private String cpf;
    private ArrayList<String> enrolled_subjects = new ArrayList();
    
    public Student(String name, String email, String cpf) {
        this.name = name;
        this.email = email;
        this.cpf = cpf;
    }
    
    public Student() {}
    
    protected void setName(String name) {
        this.name = name;
    }
    
    protected String getName() {
        return this.name;
    }
    
    protected void setEmail(String email) {
        this.email = email;
    }
    
    protected String getEmail() {
        return this.email;
    }
    
    protected void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    protected String getCpf() {
        return this.cpf;
    }
    
    private void checkIfStudentIsAlreadyEnrolledToSubject(String id) throws Exception {
        if (!this.enrolled_subjects.isEmpty() && this.enrolled_subjects.contains(id))
            throw new Exception("Student is already enrolled to this Subject");
    }

    @Override
    public void enrollToSubject(Subject subject) {
        try {
            this.checkIfStudentIsAlreadyEnrolledToSubject(subject.getId());
        } catch (Exception exception) {
            
        }
    }

    @Override
    public ArrayList<String> getSubjects() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
