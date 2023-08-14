import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class _scratchPaper2 {

    public static void main(String[] args) {

        JButton button_1 = new JButton("Next 🔥");
        JFrame frame_1 = new JFrame();
        JLabel label_1 = new JLabel("Wats Poppin world");
        JPanel panel_1 = new JPanel();

        panel_1.add(button_1);
        panel_1.add(label_1);
        frame_1.add(panel_1);

        final int FRAME_WIDTH = 600;
        final int FRAME_HEIGHT = 800;

        frame_1.setSize(FRAME_WIDTH,FRAME_HEIGHT);
        frame_1.setTitle("This is a frame with two components");
        frame_1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame_1.setVisible(true);

    }

}
