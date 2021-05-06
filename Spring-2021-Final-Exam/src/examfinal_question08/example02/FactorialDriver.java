package examfinal_question08.example02;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saikiran Reddy Gangidi
 */
public class FactorialDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("This is solution of eigth question -Saikiran Reddy Gangidi");
        System.out.println("Enter a number for factorial");
        int product=1;
        try{
            a=sc.nextInt();
        }catch(InputMismatchException e){
                System.out.println(e);
               
            }
        while(true){
            try{
                
            if(a<0)
                throw new NegativeFactorialException("factorial result be not be negative");
            else
               product*=a;
            
            }
            catch(NegativeFactorialException e){
                System.out.println(e.getMessage());
                break;
            }
            
            a--;
        }
    }
    
}
