/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examfinal_question03.example01;

/**
 *
 * @author Saikiran Reddy Gangidi
 */
public class Flute {
    private double height;
    private String color;

    public Flute(double height, String color) {
        this.height = height;
        this.color = color;
    }

    public double getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }
    public void frequency(){
            System.out.println("The frequency of the flute is 12 hz");
            
    }
    
}
