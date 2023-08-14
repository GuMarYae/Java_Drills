import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class Test extends JComponent {
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Drawing instructions
        g.drawRect(0, 10, 200, 10); // Example rectangle
        g.drawRect(0, 30, 300, 10); // Example rectangle
        g.drawString("Hello, World!", 20, 80); // Example text
    }
     public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("My Swing Application");

        // Create a new instance of your custom component
        Test customComponent = new Test();

        // Add the custom component to the frame's content pane
        frame.getContentPane().add(customComponent);

        // Set the size of the frame
        frame.setSize(400, 300);

        // Set the default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        frame.setVisible(true);
    }
}