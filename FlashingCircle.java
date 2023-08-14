// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.*;
//import java.util.scanner
//these above are much better to me
//dont have to look for specific names.. 
//concern is, does it take up ram space etc

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.Timer;
import javax.swing.JButton;
/////////////////////////////////////////

public class FlashingCircle extends JFrame {
    // Time delay in milliseconds
    private int t_interval = 3000;
    private int frameW = 480;
    private int frameH = 300;
    private int x_axis;
    private int y_axis;
    private int r;

    // circle function
    public FlashingCircle() {
        setSize(frameW, frameH);
        setTitle("Flashing Circle");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        x_axis = (int) (Math.random() * frameW);
        y_axis = (int) (Math.random() * frameH);
        // radius
        // 0 and < 1 so ill make it between 0 and whatever axis
        r = (int) (Math.random() * frameH);

        // button
        JButton button = new JButton("Quit?  It doesnt Quit");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        // added the button but it wont close
        add(button);

        class MyListener implements ActionListener {
            public void actionPerformed(ActionEvent event) {
                x_axis = (int) (Math.random() * frameW);
                y_axis = (int) (Math.random() * frameH);
                // r is radius not random
                r = (int) (Math.random() * frameH);
                repaint();
            }
        }
        MyListener listener = new MyListener();
        Timer timer = new Timer(t_interval, listener);
        timer.start();

        setVisible(true);

    }

    public void paint(Graphics graphics) {
        super.paint(graphics);
        Color peach = new Color(229, 183, 172);
        graphics.setColor(peach);
        graphics.fillOval(x_axis - r, y_axis - r, r * 2, r * 2);
    }
    ///////////////
    // JPanel buttonPanel = new JPanel();

    public static void main(String[] args) {
        new FlashingCircle();
    }

}