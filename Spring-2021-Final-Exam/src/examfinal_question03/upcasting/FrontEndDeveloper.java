/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examfinal_question03.upcasting;

/**
 *
 * @author Saikiran Reddy Gangidi
 */
public class FrontEndDeveloper extends Developer{
    double sal;
String planguages;
    public FrontEndDeveloper( String type, String planguages,double sal) {
        super(type);
        this.sal = sal;
    }
  public String getPlanguages() {
        return planguages;
    }
    public double getSal() {
        return sal;
    }
    
    public void implemet(){
        System.out.println("This front developer develop all the interface which is used to interact with user");
    }

    @Override
    public String toString() {
        return super.toString()+"\nFrontEndDeveloper{" + "sal=" + sal + ", planguages=" + planguages + '}';
    }
    
}
