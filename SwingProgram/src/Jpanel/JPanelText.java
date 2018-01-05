package Jpanel;

import javax.imageio.plugins.jpeg.JPEGHuffmanTable;
import javax.swing.*;
import java.awt.*;

public class JPanelText extends JFrame {

    public JPanelText()  {
        Container c =getContentPane();
        c.setLayout(new GridLayout(2,1,10,10));
        JPanel p1= new JPanel(new GridLayout(1,3,10,10));
        JPanel p2 = new JPanel(new GridLayout(1,2,10,10));
        JPanel p3 = new JPanel(new GridLayout(1,2,10,10));
        JPanel p4 = new JPanel(new GridLayout(2,1,10,10));

        p1.add(new JButton("1"));
        p2.add(new JButton("2"));
        p2.add(new JButton("3"));
        p2.add(new JButton("4"));
        p3.add(new JButton("5"));
        p3.add(new JButton("6"));
        p3.add(new JButton("7"));
        p4.add(new JButton("8"));
        p4.add(new JButton("9"));
        p4.add(new JButton("10"));

        c.add(p1);
        c.add(p2);
        c.add(p3);
        c.add(p4);

    }
}
