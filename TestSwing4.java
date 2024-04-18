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
public class TestSwing4 {
    
    JFrame frame;
    Container c;
    BorderLayout b;
    
    JButton b1,b2,b3,b4,b5;
    
    JTextField tf;
    
    
    public void initGUI(){
        frame = new JFrame("Calculator");
        
        c = frame.getContentPane();
        
        b = new BorderLayout();
        
        c.setLayout(b);
        
        
        b1 = new JButton("North");
        b2 = new JButton("South");
        b3 = new JButton("East");
        b4 = new JButton("West");
        b5 = new JButton("CentER");
        
        
        c.add(b1, BorderLayout.NORTH );
        c.add(b2, BorderLayout.SOUTH );
        c.add(b3, BorderLayout.EAST );
        c.add(b4, BorderLayout.WEST );
        c.add(b5, BorderLayout.CENTER );
        
        
        frame.setSize(200,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        
      
    }
    
    
    public TestSwing4(){
        
        initGUI();
    
}
    
    
    
    public static void main(String args[]){
        
        TestSwing4 obj = new TestSwing4();
        
    }
    
}
