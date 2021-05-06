/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examfinal_question05;

/**
 *
 * @author Saikiran Reddy Gangidi
 */
public class TestDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("This is solution of fifth question - Saikiran Reddy Gangidi");
        ComparableCircle c1=new ComparableCircle(9.2);
        ComparableCircle c2=new ComparableCircle(10.2);
        if(c1.compareTo(c2) == 1){
            System.out.println("This first circle c1 has bigger area than second circle c2 ");
        }else if(c1.compareTo(c2) == 0)
            System.out.println("This first circle c1 and the second circle c2 are equal ");
        else{
            System.out.println("This second circle c2 has bigger area than first circle c1");
        }
    }
    
}
