/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examfinal_question06.uncheckedException;

import java.util.Scanner;

/**
 *
 * @author Saikiran Reddy Gangidi
 */
public class UncheckedExample01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("This  is solution of eight question");
       
            System.out.println("Enter a Value:");
            int a = sc.nextInt();
            System.out.println("Enter b a boolean Value:");
            boolean b = sc.nextBoolean();
            System.out.println("Values of a:" + a + " , b :" + b);
        
    }
    
}
