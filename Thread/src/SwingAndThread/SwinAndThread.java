package SwingAndThread;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class SwinAndThread extends JFrame {
    private JLabel jl = new JLabel();
    private static Thread t;
    private int count =0;
    private Container container = getContentPane();
    public SwinAndThread()
    {
        setBounds(300,200,250,100);
        container.setLayout(null);

        URL url =SwinAndThread.class.getResource("1.gif");
        Icon icon = new ImageIcon(url);
        jl.setIcon(icon);
        jl.setHorizontalAlignment(SwingConstants.LEFT);
        jl.setBounds(10,10,200,50);
        jl.setOpaque(true);

        t=new Thread(new Runnable() {
            @Override
            public void run() {
                while (count <=200)
                {

                }
            }
        });


    }
}
