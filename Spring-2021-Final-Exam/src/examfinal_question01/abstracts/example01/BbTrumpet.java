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
public class BbTrumpet extends Trumpet {
    String model;

    public BbTrumpet( String name, String model,String color) {
        super(name, color);
        this.model = model;
    }
    
    @Override
    public void frequency(){
        System.out.println("The frequency of BbTrumpet is 26hz");
                
    }
    
    @Override
    public void resistance(){
        System.out.println("Resistance of Bbtrumpet is 12ohms");
    }
    
    @Override
    public void start(){
        System.out.println("Bbtrumpet is started playing music");
    }
}
