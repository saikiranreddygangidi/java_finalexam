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
public class HydridMotorBike implements ElectronicBike,GasBike{
    int model_year;

    public HydridMotorBike(int model_year) {
        this.model_year = model_year;
    }
    public void chargeCapacity(){
        if(model_year >=2017)
        System.out.println("The charge capacity of the bike is 1100 watts");
        else
           System.out.println("The charge capacity of the bike is 900 watts"); 
    }
    public void gasCapacity(){
        System.out.println("The gas capacity is bike is 12lit");
    }
    public void rpm(){
        if(model_year >=2017)
        System.out.println("The rpm of the bike is 120");
        else
           System.out.println("The rpm of the bike is 90");}
    public void horsePower(){
        System.out.println("The horse power of bike is 100");
    }
}
