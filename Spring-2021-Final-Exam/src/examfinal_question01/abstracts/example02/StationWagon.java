/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examfinal_question01.abstracts.example02;

/**
 *
 * @author Saikiran Reddy Gangidi
 */
public class StationWagon extends Car{
    String color;

    public StationWagon(String color) {
        this.color = color;
    }
    @Override
    public void start(){
        System.out.println("Station Wagon is started");
    }
    
    @Override
    public void run(){
        System.out.println("station wagon is running");
    }
    @Override
    public void stop(){
        System.out.println("station wagon is stoped");
    }

    public String getColor() {
        return color;
    }
    
}
