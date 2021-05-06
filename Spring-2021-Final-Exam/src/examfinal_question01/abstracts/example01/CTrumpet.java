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
public class CTrumpet extends Trumpet{
    String model;

    public CTrumpet( String name, String model,String color) {
        super(name, color);
        this.model = model;
    }
    
    @Override
    public void frequency(){
        System.out.println("The frequency of CTrumpet is 16hz");
                
    }
    
    @Override
    public void resistance(){
        System.out.println("Resistance of Ctrumpet is 5ohms");
    }
    
    @Override
    public void start(){
        System.out.println("Ctrumpet is started playing music");
    }
    
    public void material(){
        System.out.println("CTrumpet material is made with steel and plastic");
    }
}
