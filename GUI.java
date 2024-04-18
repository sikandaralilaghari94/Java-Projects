/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gui;

/**
 *
 * @author USER
 */

import java.awt.*;
import javax.swing.*;

public class GUI{
    public static void main(String args[]){
        JFrame frame = new JFrame();
        
        Container c = frame.getContentPane();
        
        
        FlowLayout flow = new FlowLayout();
        
        
        c.setLayout(flow);
        
        JButton b1 = new JButton("Click me!");
        
        
        c.add(b1);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        frame.setSize(300,400);
        frame.setVisible(true);
    }
}