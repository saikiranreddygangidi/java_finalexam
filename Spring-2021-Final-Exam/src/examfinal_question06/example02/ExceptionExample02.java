/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examfinal_question06.example02;

import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Saikiran Reddy Gangidi
 */
public class ExceptionExample02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, EOFException,IOException{
        // TODO code application logic here
        Scanner sc=new Scanner(new File("finaltxt.txt"));
        // f =new FileReader("finaltxt.txt");
        int a[]=new int[5];
        for(int i=0;i<5;i++)
            a[i]=sc.nextInt();
         try{
             System.out.println(a[100]);
         }catch(ArrayIndexOutOfBoundsException e){
             System.out.println("100 index is out of bound for the error");
         }
    }
    
}
