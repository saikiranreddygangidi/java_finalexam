/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examfinal_question03.example02;

/**
 *
 * @author Saikiran Reddy Gangidi
 */
public class FleshEatingAnimals extends Animal{
    String eats;

    public FleshEatingAnimals(String name, String color,String eats) {
        super(name, color);
        this.eats = eats;
    }

    public void eating_habit(){
        System.out.println(name +" eats "+eats);
    }

    @Override
    public String toString() {
        return super.toString()+"\nFleshEatingAnimals{" + "eats=" + eats + '}';
    }
    
}
