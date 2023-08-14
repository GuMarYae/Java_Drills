package week3adj.circle;
//all possible imports in both libraries

//USEFUL page 418, ch 8.12.2
// import javax.swing.*;
// import java.awt.*;
//import java.util.*;

import java.awt.Container;
import java.awt.Dimension;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.Graphics;

public class DrawCircle extends JFrame {

    private JTextField xField;
    private JTextField yField;
    private JTextField radiusField;
    private JButton drawButton;

    public DrawCircle() {
        setTitle("Make a circle");
        // crg9 5120 x 1440
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        // x position
        JLabel xPos = new JLabel("X Position: ");
        // its fine if it exeeds 10. it just wont be shown on the screen
        xField = new JTextField(10);
        add(xPos);
        add(xField);
        // y position
        // make all positions the same (columns)
        JLabel yPos = new JLabel("Y Position: ");
        yField = new JTextField(10);
        add(yPos);
        add(yField);
        // radius
        JLabel radPos = new JLabel("Radius: ");
        radiusField = new JTextField(10);
        add(radPos);
        add(radiusField);
        // button  this is like React/JavaScript 
        drawButton = new JButton("Generate");
        add(drawButton);

        // event that performs the action of a circle
        drawButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                int x = Integer.parseInt(xField.getText());
                int y = Integer.parseInt(yField.getText());
                int radius = Integer.parseInt(radiusField.getText());

                JFrame frame = new JFrame();
                // set the size of the window
                frame.setSize(800, 600);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);

                JPanel panel = new JPanel() {
                    int number = 2;

                    // actual method from Jcomponent |the paintComponent|
                    //the paintComponent method receives an object of type Graphics
                    //this is like React/JavaScript (props) parameter
                    protected void paintComponent(Graphics g) {
                        super.paintComponent(g);
                        g.drawOval(x - radius, y - radius, radius * number, radius * number);
                    }
                };

                frame.add(panel);
            }
        });
    }
}