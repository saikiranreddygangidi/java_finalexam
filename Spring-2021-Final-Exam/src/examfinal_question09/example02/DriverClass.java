/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examfinal_question09.example02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Saikiran Reddy Gangidi
 */
public class DriverClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc=new Scanner(new File("classname.txt"));
        while(sc.hasNext()){
            String s=sc.next();
            char a=s.toCharArray()[0];
            try{
            if(a >='A'&& a<='Z' )
                System.out.println( s+" - Class name starts with capital letter");
            else
                throw new JavaClassNameException();}
            catch(JavaClassNameException j){
                System.out.println(s+" - java Class name must starts with capital letter");
            }
            
        }
    }
    
}
