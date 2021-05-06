/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examfinal_question03.upcasting.example02;

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
        System.out.println("This is solution of third question - saikiran Reddy Gangidi");
        PlasticBottle pb =new PlasticBottle(2,"pink","plastic");
        pb.material();
        Bottle b=pb;
        System.out.println("The quantity bottle is "+b.getQuantity()+" and with color is "+b.getColor());
        
    }
    
}
