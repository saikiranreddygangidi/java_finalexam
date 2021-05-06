/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examfinal_question05;

/**
 *
 * @author Saikiran Reddy Gangidi
 */
public class ComparableCircle extends Circle implements Comparable<ComparableCircle>{

    public ComparableCircle(double radius) {
        super(radius);
    }
    
    @Override
    public int compareTo(ComparableCircle cc){
        if(area() > cc.area())
            return 1;
        else if( area() == cc.area())
            return 0;
        else
            return -1;
    }
}
