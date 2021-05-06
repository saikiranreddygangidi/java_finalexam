/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examfinal_question01.abstracts.example01;

/**
 *
 * @author S541902
 */
public abstract class Trumpet {
    
    String name;
    String color;

    public Trumpet(String name, String color) {
        this.name = name;
        this.color = color;
    }
    public abstract void frequency();
    public abstract void resistance();
    public abstract void start();
}
