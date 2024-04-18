/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polymorphism;

/**
 *
 * @author USER
 */

class Vehicle{
    public void move(){
        System.out.println("Vehicles can move");
    }
}

class MotorBike extends Vehicle{
    public void move(){
        System.out.println("MotorBike can move and accelerate too!");
    }
}
public class Test {
    
    public static void main(String args[]){
        
        
        Vehicle vh = new MotorBike();
        vh.move();
        
        vh = new Vehicle();
        vh.move();
    }
    
}
