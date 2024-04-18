/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.Handling;

/**
 *
 * @author USER
 */

import java.util.*;


class InvalidGPAException extends Exception{
    InvalidGPAException(){
        super("Invalid cga entered. please entered cgpa 0 to 4");
    }
}


class Student{
    
    private String name;
    
    private double gpa;
    
    
    void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }    
    
    
    void setGPA(double gpa) throws InvalidGPAException{
        
        if(gpa >=0 && gpa <=4){
            this.gpa = gpa;}
        else{
            
            throw new InvalidGPAException();
        }
    }
    
    
    void printData(){
        System.out.println(name + ", " + gpa);
    }
            
            
            }
    
   public class ExceptionHandling{
       
       
       
       public static void main(String args[]) throws InvalidGPAException{
           Student s1 = new Student();
           
           Scanner sc = new Scanner(System.in);
           
           System.out.println("Enter the number for cgpa");
           int input = sc.nextInt();
           
           s1.setName("Kainat Sikandar");
           
           
           try{
               s1.setGPA(input);
           }
           catch(InvalidGPAException ae){
               System.out.println(ae.getMessage());
           }
           
           
           s1.printData();
       }
   /* 
  // Code 1 Exception Handling
    public static void main(String[] args) {
       int num1, num2;
       
       int arr[] = {1,2,3,4,5};
       
       
       Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter Number 1: ");
       
       num1 = sc.nextInt();
       
        System.out.println("Enter Number 2: ");
        
        num2 = sc.nextInt();
        
        try{
            System.out.println(num1/num2);
        }
        catch(ArithmeticException ae){
            System.out.println(ae.getMessage());
        }
       finally{
            System.out.println("I will execute always");
        }
        
        System.out.println("After division");
        
        try{
            System.out.println(arr[num1]);
        }
        
        catch(ArrayIndexOutOfBoundsException ae ){
            
            System.out.println(ae.getMessage());
            
        }
        
        System.out.println("This is after exception");
       
       
    }*/
}
