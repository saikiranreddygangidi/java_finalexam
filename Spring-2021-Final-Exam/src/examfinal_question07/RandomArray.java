/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examfinal_question07;

import java.util.Scanner;

/**
 *
 * @author Saikiran Reddy Gangidi
 */
public class RandomArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("This is solution of  seventh question - Saikiran Reddy Gangidi");
        
        int ran[]=new int[100];
        for(int i=0;i<100;i++){
            ran[i]=(int)Math.floor(Math.random()*100);
        }
        Scanner sc=new Scanner(System.in);
        try{
          System.out.print("Enter the index : ");
            int index=sc.nextInt();
            
            System.out.println(ran[index]);
            
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Out of Bounds");
            
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
