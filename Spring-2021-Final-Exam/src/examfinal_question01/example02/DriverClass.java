/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examfinal_question01.example02;

/**
 *
 * @author S541902
 */
public class DriverClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("This is solution of first question - Saikiran Reddy Gangidi");
        HydridMotorBike hb=new HydridMotorBike(2016);
        hb.chargeCapacity();
        hb.gasCapacity();
        hb.horsePower();
        hb.rpm();
        System.out.println("------------------------------------------------");
        HydridMotorBike hb1=new HydridMotorBike(2018);
        hb1.chargeCapacity();
        hb1.gasCapacity();
        hb1.horsePower();
        hb1.rpm();
        System.out.println("------------------------------------------------");
    }
    
}
