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
public class Search_Recursion {

    public static int recursion_search(int a[],int ele,int index){
        if(index == a.length)
            return 0;
        else{
            if(a[index] == ele)
                return 1;
            return recursion_search(a,ele,index+1);
                
                }
        
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[] = {10,12,5,17,16,99,28,77,76,18};
        System.out.println("This is solution of tenth question - Saikiran Reddy Gangidi");
        System.out.println("Enter a number to search in list");
        Scanner sc=new Scanner(System.in);
        int ele=sc.nextInt();
        if(recursion_search(a,ele,0) ==1)
            System.out.println("Element found in the list");
        else
             System.out.println("Element not found in the list");
        
    }
    
}
