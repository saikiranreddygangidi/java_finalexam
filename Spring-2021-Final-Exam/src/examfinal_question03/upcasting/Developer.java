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
public class Developer {
    String type;
    

    public Developer(String type ) {
        this.type = type;
        
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Developer{" + "type=" + type + '}';
    }

  
    
}
