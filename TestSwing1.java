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

public class TestSwing1
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        Container c = frame.getContentPane() ;
        FlowLayout flow = new FlowLayout();
        c.setLayout(flow);
        JButton b1 = new JButton ("Click Me!") ;
        c.add (b1);
 	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(120,120);
        frame.setVisible(true);
    }
}