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
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("This is example of question03 - saikiran Reddy Gangidi");
        FrontEndDeveloper fd=new FrontEndDeveloper("ttyped-developer","scripting-language,makeup lang",1200000);
        fd.implemet();
       
        System.out.println("Here programing language for front end are "+fd.getPlanguages());
        //here example of upcasting
        Developer d=fd;
        System.out.println("the type of developer is"+d.getType());
        
       
        
        
    }
    
}
