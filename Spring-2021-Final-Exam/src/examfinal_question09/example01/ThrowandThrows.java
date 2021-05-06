/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examfinal_question09.example01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author S541902
 */
public class ThrowandThrows {

    /**
     * @param args the command line arguments
     */
    //we mentioned the checked Exception that is FileNotFoundException which we declare in the  method header using the  keyword throws
    //we are specifing to jvm that the error may occuer in main method when we search for file and error raise if file is not found.
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("input.txt"));
        PrintWriter p =new PrintWriter("output2.txt");
        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            double result;
            try {
                if (b == 0) {
                    //Here we thrown or raised  a Arthimetricexception  using the keyword throw 
                    //this exception raise whenever value b is zero and that is handled by catch block.
                    //Here we can only throw one Exception at time in the throw statement .
                    throw new ArithmeticException();
                } else {
                    result = (double)a / b;
                    p.println(result);

                }
            } catch (ArithmeticException e) {

                System.out.println("value of b must not be zero");
            }
        }
        p.close();
    }

}
