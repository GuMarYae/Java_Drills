 import javax.swing.*;
 import java.awt.*;
// import javax.swing.JFrame;
// import javax.swing.JTextField;
// import javax.swing.JLabel;
// import javax.swing.JButton;
// import javax.swing.SwingUtilities;

// import java.awt.FlowLayout;
// import java.awt.Graphics;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawCircle extends JFrame {

    private JTextField xField;
    private JTextField yField;
    private JTextField radiusField;
    private JButton drawButton;

    public DrawCircle() {
        setTitle("Make a circle");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel label_x = new JLabel("X Position: ");
        xField = new JTextField(10);
        add(label_x);
        add(xField);

        JLabel label_y = new JLabel("Y Position: ");
        yField = new JTextField(10);
        add(label_y);
        add(yField);

        JLabel radiusLabel = new JLabel("Radius: ");
        radiusField = new JTextField(10);
        add(radiusLabel);
        add(radiusField);

        drawButton = new JButton("Draw");
        add(drawButton);

        drawButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                int x = Integer.parseInt(xField.getText());
                int y = Integer.parseInt(yField.getText());
                int radius = Integer.parseInt(radiusField.getText());

                JFrame frame = new JFrame();
                frame.setSize(800, 600);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);

                JPanel panel = new JPanel() {
                    
                    protected void paintComponent(Graphics g) {
                        super.paintComponent(g);
                        g.drawOval(x - radius, y - radius, radius * 2, radius * 2);
                    }
                };

                frame.add(panel);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            
            public void run() {
                new DrawCircle().setVisible(true);
            }
        });
    }
}