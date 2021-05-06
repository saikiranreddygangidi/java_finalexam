/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examfinal_question06.example01;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author Saikiran Reddy Gangidi
 */
public class ExceptionDriver {

    /**
     * @param args the command line arguments
     */
    
    //here we declare a Checked Exception FileNotFoundException which is subclass of Exception where is decalred in method header using throws keyword
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
       PrintWriter p = new PrintWriter("output.txt");
      
       p=null;
       
       p.write("this is the first line");
       //here we can also declares the uncheckedException NullpointerException which is catched  the NullPointerException occured in try block
    }
       
       
       
       
    }
    

