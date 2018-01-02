package frame;

import javafx.scene.control.ComboBox;

import javax.swing.*;
import java.awt.*;
import java.util.Set;

public class Map {


    public  static void main(String [] args)
    {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                SimpleFrame frame = new SimpleFrame();

                Choice c = new Choice();
                c.add("red");
                c.add("Green");
                c.add("Blue");
                frame.add(c);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }

}
