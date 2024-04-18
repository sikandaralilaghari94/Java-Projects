/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gui;

/**
 *
 * @author USER
 */

import java.awt.*;
import javax.swing.*;
public class TestSwing3 {
    
    JFrame frame;
    Container c;
    GridLayout g;
    JButton b1,b2,b3,b4;
    
    JTextField tf;
    
    
    public void initGUI(){
        frame = new JFrame("Calculator");
        
        c = frame.getContentPane();
        
        g = new GridLayout(2,2,10,20);
        
        c.setLayout(g);
        
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        
        
        tf = new JTextField(10);
        
        
        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4);
        
        
        frame.setSize(300,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
                
        
        
        
    }
    
    public TestSwing3 (){
        initGUI();
        
    
    }
    

    
    
    
    public static void main(String args[]){
        
        TestSwing3 obj = new TestSwing3();
        
    }
    
}
