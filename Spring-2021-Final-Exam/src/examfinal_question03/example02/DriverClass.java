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
public class DriverClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("This is example of third question - Saikiran Reddy Gangidi");
        
        //this is example of upcasting
        System.out.println("This is example of up casting");
        //This  to Animal class type variableis upcasting where we stored FleshEating object in  Superclass refrence type variable that is Animal class
        //where it object(FleshEatingAnimal) implictly converts to Animal class type variable
        Animal a1=new FleshEatingAnimals("Lion","tawny yellow","raw flesh");
        System.out.println(a1.toString());
        
        
       FleshEatingAnimals fa1 = new FleshEatingAnimals("WhiteTiger","white","flesh");
       
       Animal a2;
       //This  to Animal class type variableis upcasting where we stored FleshEating object in  Superclass refrence type variable that is Animal class
        //where it object(FleshEatingAnimal) implictly converts to Animal class type variable which is example of up casting
       a2=fa1;
       
        System.out.println("-----------------------------------------");
       //this is example of downCasting
       System.out.println("This is example of down casting");
       
       //This is example of downcasting where Animal object refrence variabel is converting to subclass object refrence  
       //by explicity mentioning which type of subclass it converts .This is example of downcasting
       FleshEatingAnimals fa2=(FleshEatingAnimals)a2;
       fa2.eating_habit();
        System.out.println(fa2.toString());
       
        
    }
    
}
