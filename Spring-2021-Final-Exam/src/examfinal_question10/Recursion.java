/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examfinal_question10;

import java.util.Scanner;

/**
 *
 * @author S541902
 */
public class Recursion {

    /**
     * @param args the command line arguments
     */
     public static int iteration_nfibonacci(int a){
         int result=0;
         int p=0;
         int q=1;
       if(a==1)
          result=p;
       else
       if(a == 2)
           result =q;
       else         
       for(int i=3;i<=a;i++){
           result=p+q;
           p=q;
           q=result;
       }
       return result;
    }
    public static int recursion_nfibonacci(int a){
       if(a == 1)
           return 0;
       if(a==2)
           return 1;
       else
           return recursion_nfibonacci(a-1)+recursion_nfibonacci(a-2);
    }
     public static int infinite_fibonacci(int a){
       
           return a*infinite_fibonacci(a-1);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("This is solution of tenth question - Saikiran Reddy Gangidi ");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter which digit in fibonacci series should display : ");
        int a=sc.nextInt();
        
        System.out.println( a +" fibonacci digit through iteration "+iteration_nfibonacci(a));
        
        System.out.println(a+" fibonacci digit  through recursion "+recursion_nfibonacci(a));
        
        
        System.out.println(a+" fibonacci digit of number through infinity_recursion");
        System.out.println(infinite_fibonacci(a));
    }
    
}
