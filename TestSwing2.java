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


public class TestSwing2{
    JFrame frame;
    
    Container c;
    
    FlowLayout f;
    
    JTextField tf;
    
    JButton b1;
    
    
    public void initGUI(){
        
        frame = new JFrame();
        
        c = frame.getContentPane();
        
        f = new FlowLayout();
        
        c.setLayout(f);
        
        b1 = new JButton("Click Me!");
        
        tf = new JTextField(10);
        
        
        c.add(b1);
        c.add(tf);
        
        frame.setSize(300,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
}
    
    public TestSwing2(){
        initGUI();
    }
    
  
    
    
    public static void main(String args[]){
        
        
        TestSwing2 obj = new TestSwing2();
        
    }
}
