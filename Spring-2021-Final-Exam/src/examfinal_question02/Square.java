/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examfinal_question02;

/**
 *
 * @author Saikiran Reddy Gangidi
 */
public class Square extends GeometricObject implements Colorable{
   
private double side;

    public Square(double side) {
        this.side = side;
    }

   
    

@Override
    public double getArea(){
    return side*side;
}
   
@Override
    public void howToColor(){
        System.out.println("Color all four sides");
    }
  
    
}
