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
public class StudentData implements CollegeData,HostelData{

   String name;
   long rollnum;
   int apt_no;

    public StudentData(String name, long rollnum, int apt_no) {
        this.name = name;
        this.rollnum = rollnum;
        this.apt_no = apt_no;
    }
   public void collegeDetails(){
       System.out.println("The college name is sgcm");
   }
   public void student_collegeDetails(){
       System.out.println("The student of sgcm college name is "+name+" with roll no :"+rollnum);
   }
   public void hostelDetails(){
       System.out.println("The hostel name is ktm hostel ");
   }
   public void student_hostelDetails(){
       System.out.println("The student "+name+" with roll no :"+rollnum +" lives in apt no "+apt_no);
   }
}
