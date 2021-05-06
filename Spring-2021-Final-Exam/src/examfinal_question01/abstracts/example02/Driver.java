/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examfinal_question01.abstracts.example02;

/**
 *
 * @author Saikiran Reddy Gangidi
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("This is solution of first question - Saikiran Reddy Gangidi");
        StationWagon st=new StationWagon("brown");
        System.out.println("color of StationWagon is : "+st.getColor());
        st.start();
        st.run();
        st.stop();
        
        
    }
    
}
