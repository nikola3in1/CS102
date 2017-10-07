import javax.swing.*;
import java.awt.*;
import java.awt.EventQueue; 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pingvinweb
 */
class Main extends JFrame implements Runnable{
    private static final long serialVersionUID = 1L;
    private Thread repaintThread;
    /**
     * @param args the command line arguments
     */
    public Main(){

        super("Java kvadratici");
        setSize(640,480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        this.repaintThread = new Thread(this);
        this.repaintThread.start();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable(){


            @Override
            public void run() {

            }
        });

    }


    @Override
    public void run() {

    }
}