/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collegemanagement;

/**
 *
 * @author junior
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student student = new Student();
        
        student.setName("Abel Souza");
        student.setEmail("mail@mail.com");
        student.setCpf("0000000000000");
        
        Subject subject1 = new Subject("CS101", "Introdução a Ciência da Computação", 120);
        Subject subject2 = new Subject("MGM3200", "Gerenciamento de Projetos", 80);
        
        student.enrollToSubject(subject1);
        student.enrollToSubject(subject2);
        
        System.out.println("O aluno " + student.getName() + " está inscrito nas matérias: " + student.getSubjects());
     
    }
    
}
