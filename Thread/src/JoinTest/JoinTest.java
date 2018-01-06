package JoinTest;

import javax.swing.*;
import java.awt.*;

public class JoinTest extends JFrame {
    private  Thread threadA;
    private  Thread threadB;
    final  JProgressBar progressBar1= new JProgressBar();
    final  JProgressBar progressBar2= new JProgressBar();
    int count=0;
    public static  void main(String[] args)
    {
        init(new JoinTest(),100,100);
    }

    public JoinTest(){
        super();
        getContentPane().add(progressBar1, BorderLayout.NORTH);
        getContentPane().add(progressBar2,BorderLayout.SOUTH);
        progressBar1.setStringPainted(true);
        progressBar2.setStringPainted(true);

        //threadA = new Thread(())
    }

    public static void init(JFrame frame,int width,int height)
    {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width,height);
        frame.setVisible(true);
    }
}
