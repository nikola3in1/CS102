import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pingvinweb
 */
public class Zadatak3 extends JPanel{

    public void paint(Graphics g) {

        Graphics2D g2 = (Graphics2D)g;

        g2.setColor(Color.RED);
        g2.drawRect(50,50,100,100);

        g2.setColor(Color.BLUE);
        g2.drawRect(100,100,100,100);

        g2.setColor(Color.BLUE);
        g2.drawRect(150,150,100,100);

    }

    public void run(){
        while(this.isVisible());
        this.repaint();
        try{

            Thread.sleep(50);

        } catch(InterruptedException e) {

            e.printStackTrace();
        }
    }

}