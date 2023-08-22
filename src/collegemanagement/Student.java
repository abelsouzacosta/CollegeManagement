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
    private String id;
    private String name;
    private String email;
    private String cpf;
    private ArrayList<String> subjects = new ArrayList();
    
    public Student(String id, String name, String email, String cpf) {
        this.id = id;
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
    
    protected String getId() {
        return this.id;
    }
    
    private void checkIfStudentIsAlreadyEnrolledToSubject(String id) throws Exception {
        if (!this.subjects.isEmpty() && this.subjects.contains(id))
            throw new Exception("Student is already enrolled to this Subject");
    }

    @Override
    public void enrollToSubject(Subject subject) {
        try {
            this.checkIfStudentIsAlreadyEnrolledToSubject(subject.getId());
            this.subjects.add(subject.getId());
        } catch (Exception exception) {
            System.out.println("Error: " + exception.getMessage());
        }
    }

    @Override
    public ArrayList<String> getSubjects() {
        return this.subjects;
    }
}
