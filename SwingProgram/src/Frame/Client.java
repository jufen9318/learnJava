package Frame;

import javafx.embed.swing.JFXPanel;

import javax.swing.*;
import java.awt.*;

public class Client extends JFrame {
    public void CreateJFrame(String title)
    {
        JFrame jf = new JFrame(title);
        Container container = jf.getContentPane();
        JLabel jl = new JLabel("this is a JFrame frame");
        jl.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(jl);
        container.setBackground(Color.white);
        jf.setVisible(true);
        jf.setSize(200,150);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String args[])
    {
        new Client().CreateJFrame("Create a JFrame ");
    }
}
