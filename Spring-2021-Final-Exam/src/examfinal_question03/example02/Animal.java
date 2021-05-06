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
public class Animal {
    String name;
    String color;

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Animal{" + "name=" + name + ", color=" + color + '}';
    }
    
}
