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
public class Subject implements SubjectAcademicActions {
    private String id;
    private String name;
    private int work_load;
    private ArrayList<String> students = new ArrayList();
    
    public Subject() {}
    
    public Subject(String id, String name, int work_load) {
        this.id = id;
        this.name = name;
        this.work_load = work_load;
    }
    
    protected void setName(String name) {
        this.name = name;
    }
    
    protected String getName() {
        return this.name;
    }
    
    protected void setWorkLoad(int work_load) {
        this.work_load = work_load;
    }
    
    protected int getWorkLoad() {
        return this.work_load;
    }
    
    protected String getId() {
        return this.id;
    }

    @Override
    public void enrollStudent(Student student) {
        this.students.add(student.getId());
    }

    @Override
    public ArrayList<String> getStudents() {
        return this.students;
    }
}
