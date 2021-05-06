/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examfinal_question12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Saikiran Reddy Gangidi
 */
public class EmployeeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("This is solution of twelve solution - Saikiran Reddy Gangidi");
        ArrayList<Employee> al =new ArrayList<Employee>(); 
        Employee e1=new Employee(111,"saikiran",12000);
        Employee e2=new Employee(121,"venkatesh",8000);
        Employee e3=new Employee(112,"dinesh",10000);
        Employee e4=new Employee(122,"sachin",7000);
        Employee e5=new Employee(101,"anudeep",6000);
        
        al.add(e1);
        al.add(e2);
        al.add(e3);
        al.add(e4);
        al.add(e5);
        System.out.println("*********** This is Orginal list ***********");
        for(Employee e:al){
            System.out.println(e.toString());
        }
        
        Collections.sort(al);
        System.out.println("*********** list after sorting by its natural order (empId number) ***********");
         for(Employee e:al){
            System.out.println(e.toString());
        }
         
          Collections.sort(al,new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                if (e1.getEmpSalary() > e2.getEmpSalary()) {
                    return 1;
                } else if(e1.getEmpSalary() > e2.getEmpSalary()){
                    return 0;
                } else{
                    return -1;
                }
            }
        });
          System.out.println("*********** list after sorting by salary ***********");
          for(Employee e:al){
            System.out.println(e.toString());
        }
         
         Collections.sort(al,new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                if (e1.getEmpName().compareTo(e2.getEmpName()) == 0) {
                    return e1.getEmpName().compareTo(e2.getEmpName());
                } else {
                    return e1.getEmpName().compareTo(e2.getEmpName());
                } 
            }
        });
         
          System.out.println("*********** list after sorting by name ***********");
         for(Employee e:al){
            System.out.println(e.toString());
        }
         
    }
    
}
