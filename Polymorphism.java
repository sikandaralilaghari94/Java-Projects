/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polymorphism;

/**
 *
 * @author USER
 */


class demoOverload{
    public int add(int x, int y){
        return x + y;
        
        
    }
    
    public int add(int x, int y, int z){
        return x + y + z;
    }
    
    public int add(double x, int y){
        return (int) x + y;
    }
    
    public int add(int x, double y){
        return x + (int) y;
    }
    
    
}
public class Polymorphism {

    public static void main(String[] args) {
        demoOverload obj = new demoOverload();
        
        System.out.println(obj.add(4, 4));// Method 1 called
        System.out.println(obj.add(4, 4, 4)); // Method 2 called
        System.out.println(obj.add(4.5, 6)); // Method 3 called
        System.out.println(obj.add(5, 4.5)); // Method 4 Called
    }
}
