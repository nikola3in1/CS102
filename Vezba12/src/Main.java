import Zad2.Sah;

import javax.swing.*;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by nikola3in1 on 21.12.16..
 */
public class Main extends JFrame
{

    JPanel panel = new JPanel(null);
    public static void main(String[] args) {
        new Main();
    }

    public Main(){
        System.out.println(2934%20);

        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        panel.setLayout(null);
        //panel.setResizable(false);

        setContentPane(new Sah());
        setResizable(false);
        setVisible(true);

    }



}
