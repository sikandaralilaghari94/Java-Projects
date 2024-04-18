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
public class TestMyCalc {
    
    
    JFrame frame;
    
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0;
    
    JButton bplus, bminus, bmultiply,  bpoint, bclear, bequal;
    
    JPanel pbuttons;
    
    JTextField tanswer;
    Container c;
    
    
    BorderLayout b ;
    
    JLabel ltitle;
    
    
    public void initGUI(){
        
        frame = new JFrame("Calculator");
        
        c = frame.getContentPane();
        
        b = new BorderLayout();
        
        c.setLayout(b);
        
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        
        
        bplus = new JButton("+");
        bminus = new JButton("-");
        bmultiply = new JButton("*");
        
        bpoint = new JButton(".");
        bequal = new JButton("=");
        bclear = new JButton("+/-");
        
        ltitle = new JLabel("My Calculator");
        tanswer = new JTextField(100);
        
        pbuttons = new JPanel();
        pbuttons.setLayout(new GridLayout(5,5));
        
        
        pbuttons.add(b7); 
        
        pbuttons.add(b8);
        
        pbuttons.add(b9);
        
        pbuttons.add(bmultiply);
        
        
         pbuttons.add(b4);
         pbuttons.add(b5);
        pbuttons.add(b6);
        
        pbuttons.add(bminus);
        
        
        
        pbuttons.add(b1);
        pbuttons.add(b2);
        pbuttons.add(b3);
        
        pbuttons.add(bplus);
        
        
        pbuttons.add(bclear);
        
        pbuttons.add(b0);
        pbuttons.add(bpoint);
        
        
        
        
        
       
        
        pbuttons.add(bequal);
        
        
        c.add(ltitle,BorderLayout.SOUTH);
        c.add(tanswer,BorderLayout.NORTH);
        c.add(pbuttons,BorderLayout.CENTER);
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,500);
        frame.setVisible(true);
        
        
    }
    
    public TestMyCalc(){
        initGUI();
    }
    
    public static void main(String args[])
    {
        TestMyCalc obj = new TestMyCalc();
    }
}
