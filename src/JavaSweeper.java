import javax.swing.*;
import java.awt.*;

public class JavaSweeper extends JFrame {



    private JPanel panel;
    private final int COLS = 15;
    private final int ROWS = 1;
    private final int IMAGE_SIZE = 50;


    public static void main(String[] args) {
        new JavaSweeper().setVisible(true);

    }

    private JavaSweeper() {

        initPanel();
        initFrame();

    }

    private void initPanel() {
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(COLS * IMAGE_SIZE,ROWS * IMAGE_SIZE));
        add(panel);

    }

    private void initFrame () {
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Java Sweeper");
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

    }

    private Image getImage (String name) {
        String filename = "img/" + name.toLowerCase()  + ".png";
        ImageIcon = new ImageIcon(filename);
    }

}