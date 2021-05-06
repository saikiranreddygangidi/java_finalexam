/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examfinal_question11;

/**
 *
 * @author Saikiran Reddy Gangidi
 */
public class GuitarDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("This is solution of eleventh question - Saikiran Reddy Gangidi");
        //Here in the main method we decalred four guitar object wheich later used for comparing
        //We can see that both g1,g4 object have same instance variable values.
        Guitar g1=new Guitar("nylon-string","black",6);
         Guitar g2=new Guitar("steel-string","brown",4);
          Guitar g3=new Guitar("Hawaiian guitar","green",5);
          Guitar g4=new Guitar("nylon-string","black",6);
          
          
          System.out.println("************* equals method usage *********************");
          //here compare the different guitar class objects based upon their instance values values.
          //The output may be true false based upon the instance varibale values.
          //equals method compares all the instance variable of one object with corresponding instance of another class and if both are equals returns true
          System.out.println(g1.equals(g2));
          System.out.println(g1.equals(g3));
          System.out.println(g2.equals(g3));
          System.out.println(g2.equals(g4));
          System.out.println(g1.equals(g4));
          
          
          System.out.println("************* == usage *********************");
          //here we are comapring different objects baed upon the reference location
          // == for object generally compares there reference location.
          // so if any two object variable refers to same location it return otherwise false.
          System.out.println(g1== g2);
          System.out.println(g1== g3);
          System.out.println(g2 == g3);
          System.out.println(g2 == g4);
          System.out.println(g1==g4);
          
          
          System.out.println("************* hashcode method usage *********************");
          //Here are the hashcode values of all the variable 
          //we should get g1,g4 object hash code values as same because hash code of a object on instance variable value where g1,g4 as same instance variable values
          System.out.println(g1.hashCode());
          System.out.println(g4.hashCode());
          System.out.println(g2.hashCode());
          System.out.println(g3.hashCode());
          
          
          System.out.println("************* hashcode comparing of g1 and g4 instance objects*********************");
          //This should return true because g1,g4 has same instance variable values and hash code is generated based upon the them. so object hashcode should be  same
          System.out.println(g1.hashCode() == g4.hashCode());
          //This should return false because g1,g3 has same instance variable values and hash code is generated based upon the them. so object hashcode should be  not same
          System.out.println(g1.hashCode() == g3.hashCode());
          
          System.out.println("************* address of g1 and g4 *********************");
          //we are also checked the address of g1,g4 to check whether there refer to same location 
          System.out.println(Integer.toHexString(System.identityHashCode(g1)));
        System.out.println(Integer.toHexString(System.identityHashCode(g4)));
        
    }
    
}
