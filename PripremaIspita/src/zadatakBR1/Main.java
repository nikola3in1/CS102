package zadatakBR1;

import javax.swing.*;

/**
 * Created by nikola3in1 on 29.1.17..
 */
public class Main extends JFrame{
    JPanel panel = new JPanel(null);
    public static void main(String[]args){
        new Main();
    }

    public Main(){
        setSize(600,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        panel.setLayout(null);
        setContentPane(new Panel());
        setResizable(false);
        setVisible(true);

    }


}

