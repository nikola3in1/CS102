package zadatakBR1;

import javax.swing.*;
import java.awt.*;

/**
 * Created by nikola3in1 on 29.1.17..
 */
public class Panel extends JPanel {

    public Panel() {

    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);

        Graphics2D g2d = (Graphics2D)graphics;

        g2d.setColor(Color.red);
        g2d.fillRect(getWidth()/24*2,getHeight()/20*2,76,70);
        g2d.fillRect(getWidth()/24*19,getHeight()/20*2,76,70);
        g2d.fillRect(getWidth()/24*2,getHeight()/20*15,76,70);
        g2d.fillRect(getWidth()/24*19,getHeight()/20*15,76,70);
        g2d.fillOval(getWidth()/2-100,getHeight()/2-100,190,200);

        g2d.fillPolygon(new int[] {getWidth()/24*10, getWidth()/24*10, getWidth()/24*15}, new int[] {getHeight()/20*2-8, getHeight()/20*4, getHeight()/20*4}, 3);


        g2d.setStroke(new BasicStroke(5));
        g2d.setColor(Color.white);
        g2d.drawOval(getWidth()/2-50,getHeight()/2-50,95,100);

        g2d.setColor(Color.orange);
        g2d.setStroke(new BasicStroke(5));
        g2d.drawRect(getWidth()/24*2,getHeight()/20*2,76,70);
        g2d.drawRect(getWidth()/24*19,getHeight()/20*2,76,70);
        g2d.drawRect(getWidth()/24*2,getHeight()/20*15,76,70);
        g2d.drawRect(getWidth()/24*19,getHeight()/20*15,76,70);
        g2d.drawPolygon(new int[] {getWidth()/24*10, getWidth()/24*10, getWidth()/24*15}, new int[] {getHeight()/20*2-8, getHeight()/20*4, getHeight()/20*4}, 3);


    }
}

