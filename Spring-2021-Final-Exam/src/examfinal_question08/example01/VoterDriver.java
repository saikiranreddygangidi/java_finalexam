/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examfinal_question08.example01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Saikiran Reddy Gangidi
 */
public class VoterDriver {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        
        System.out.println("This is solution of eigth question -Saikiran Reddy Gangidi");
        Scanner sc=new Scanner(new File("voter.txt"));
       String name[]=new String[10];
       int age[]=new int[10];
       int i=0;
        while(sc.hasNext()){
            try{
            name[i]=sc.next();
            int tAge=sc.nextInt();
            
            if(tAge<18)
                throw new InvaildVoterAgeException("age should be greater than or equal to 18");
            else
                age[i]=tAge;
                System.out.println(name[i] + " is a vaild voter");
            }
            catch(InvaildVoterAgeException e){
                System.out.println(e.getMessage());
            }
            i++;
        }
        
    }
    
}
