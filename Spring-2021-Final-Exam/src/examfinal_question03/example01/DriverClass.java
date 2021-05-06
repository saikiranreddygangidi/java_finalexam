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
public class DriverClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("This is  example of third question - Saikiran Reddy Gangidi");
        
        
        int height=12;
        double doublewidth=3.44;
        // we are explicity defining the to which datatype the value to convert . that is converting the wider type variable value  to narrow type is called downCasting
        //Below i am  converting the double value to  int type with explicit defining of int and stores in integer variable "intwidth" which is example of downcasting
        int intwidth=(int)doublewidth;
        
        //This is example upCasting
        //This  to Flute class type variableis upcasting where we stored PlaticFlute object in  Superclass refrence type variable that is Flute class
        //where it object(PlaticFlute) implictly converts toFlute class type variable which is example of upcasting
        Flute f1 =new PlasticFlute(intwidth,height,"pink");
        f1.frequency();
        
        
        System.out.println(" --------------------------------------- ");
        PlasticFlute pf1=new PlasticFlute(4,10,"red");
       
        //This  to Flute class type variableis upcasting where we stored PlaticFlute object in  Superclass refrence type variable that is Flute class
        //where it object(PlaticFlute) implictly converts toFlute class type variable which is example of upcasting
        Flute f2=pf1;
        
        
        //This is example of downCasting
        //This is example of downcasting where Flute object refrence variabel is converting to subclass object 
       //by explicity mentioning which type of subclass it converts to its sub class where this is example of  downcasting
        PlasticFlute pf2=(PlasticFlute)f2;
        pf1.frequency();
        pf1.raw_material();
        
        
    }
    
}
