/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examfinal_question11;

import java.util.Objects;

/**
 *
 * @author Saikiran Reddy Gangidi
 */
public class Guitar {
    String model;
    String color;
    int no_of_string;

    public Guitar(String model, String color, int no_of_string) {
        this.model = model;
        this.color = color;
        this.no_of_string = no_of_string;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getNo_of_string() {
        return no_of_string;
    }

    @Override
    public String toString() {
        return "Guitar{" + "model=" + model + ", color=" + color + ", no_of_string=" + no_of_string + '}';
    }

    @Override
    // this method return hascode value  of a class based upon the instance variables value.
    //this method is also used to compare different object of same class type based upon their instance variable value
    // the hascode value of two class will only be equal if all instance variable values of one class is equal to all th instance variable values  of comparing object. 
    public int hashCode() {
        int hash = 3;
        //Because model attribyte is string it generates a hashcode to it and add to hash value.
        hash = 59 * hash + Objects.hashCode(this.model);
        //Because model attribyte is string it generates a hashcode to it and add to hash value.
        hash = 59 * hash + Objects.hashCode(this.color);
        hash = 59 * hash + this.no_of_string;
        //after hash value of complete class.
        return hash;
    }
  
    @Override
    //Here we developed equals method which is used to compares parameter passed object with calling object and compares based upon all the instance variable ij both the classes .
    //since Object obj is super class for all the classes we can declare it in parameter where passed instance implicity converted Object type
    //This method return boolean value true  if every instance attribute value are equal in both the instances.
    public boolean equals(Object obj) {
        //this compares whether both the instance  refers to same location or same reference if yes return true
        if (this == obj) {
            return true;
        }
        //if parameter passed value is null both object never will be equal so it returns false.
        if (obj == null) {
            return false;
        }
        //comparing class cast if both the class class cast is different there we can also say both the classes are different so it return false
        if (getClass() != obj.getClass()) {
            return false;
        }
        //converting obj variable to Guitar class which is example os down casting.
        final Guitar other = (Guitar) obj;
        //comparing first instance attribute no_of_string of both the objects if not equal it directly return false.
        if (this.no_of_string != other.no_of_string) {
            return false;
        }
        //comparing second instance attributeor varibale model of both the objects if not equal it directly return false.
        if (!Objects.equals(this.model, other.model)) {
            return false;
        }
        //comparing third instance attribute color of both the objects if not equal it directly return false.
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        //this stage reacher only after all the instance variable are equals .so it returns true .
        return true;
    }
    
}
