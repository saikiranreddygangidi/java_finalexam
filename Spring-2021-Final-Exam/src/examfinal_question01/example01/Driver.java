/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examfinal_question01.example01;

/**
 *
 * @author Saikiran Reddy Gangidi
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("This is solution of first question - Saikiran Reddy Gangidi");
        
        StudentData s=new StudentData("saikiran",12345,6);
        s.collegeDetails();
        s.student_collegeDetails();
        s.hostelDetails();
        s.student_hostelDetails();
    }
    
}
