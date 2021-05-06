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
public class PlasticBottle extends Bottle{
    String material;

    public PlasticBottle(double quantity, String color,String material) {
        super(quantity, color);
        this.material = material;
    }
    public void material(){
        System.out.println("This type of bottle is made with "+material);
    }
}
