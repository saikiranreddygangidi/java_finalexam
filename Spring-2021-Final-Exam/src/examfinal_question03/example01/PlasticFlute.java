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
public class PlasticFlute extends Flute {

  int width;

    public PlasticFlute(int width, double height, String color) {
        super(height, color);
        this.width = width;
    }
  
  @Override
  public void frequency(){
      System.out.println("The frequency of plastic Flute is 8hz");
  }
   
  public void raw_material(){
      System.out.println("The raw material is plastic");
  }
    
    
}
