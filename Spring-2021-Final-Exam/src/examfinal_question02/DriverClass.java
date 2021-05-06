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
public class DriverClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GeometricObject g[]=new GeometricObject[5];
        
        
        System.out.println("This is solution for second question - Saikiran Reddy Gangidi");
        Square s1=new Square(12);
        Square s2=new Square(6);
        Square s3=new Square(7);
        Square s4=new Square(10);
        Square s5=new Square(9.3);
        g[0]=s1;g[1]=s2;g[2]=s3;g[3]=s4;g[4]=s5;
        
        for(int i=0;i<5;i++){
            System.out.println("Area of "+(i+1)+" square is "+g[i].getArea());
            if (g[i] instanceof Colorable) 
                g[i].howToColor();
            System.out.println("------------------------------------------------- ");
            
        }
        
    }
    
}
