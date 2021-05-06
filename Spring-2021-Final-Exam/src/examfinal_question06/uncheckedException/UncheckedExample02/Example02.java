/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examfinal_question06.uncheckedException.UncheckedExample02;

/**
 *
 * @author Saikiran Reddy Gangidi
 */
public class Example02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[]={10,20,30,40,50};
        System.out.println("This is solution of question 8 - saikiran reddy gangidi");
        try{
          System.out.println(a[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("the exception is : -"+ e);
        }
                
    }
    
}
