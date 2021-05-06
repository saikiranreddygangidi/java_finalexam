/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examfinal_question01.abstracts.example01;

/**
 *
 * @author Saikiran Reddy Gangidi
 */
public class Driverclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("This is solution of first question - Saikiran Reddy gangidi");
        CTrumpet t1 = new CTrumpet("ctrumpet","slight_sounded","gold");
        Trumpet t2 = new BbTrumpet("bbtrumpet","ABC sounded","silver");
        System.out.println("---------------------------------");
        t1.frequency();
        t1.resistance();
        t1.material();
        t1.start();
        System.out.println("---------------------------------");
        t2.frequency();
        t2.resistance();
        t2.start();       
        
        System.out.println("---------------------------------");
    }
    
}
