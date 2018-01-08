package Prority;

import javax.swing.*;
import java.awt.*;

public class PriorityTest extends JFrame {

    JProgressBar progressBar,progressBar2,progressBar3,progressBar4;


    public PriorityTest()
    {

        progressBar = new JProgressBar();
        progressBar2 = new JProgressBar();
        progressBar3 = new JProgressBar();
        progressBar4 = new JProgressBar();

        progressBar.setStringPainted(true);
        progressBar2.setStringPainted(true);
        progressBar3.setStringPainted(true);
        progressBar4.setStringPainted(true);

        setSize(500,500);
        getContentPane().add(progressBar, BorderLayout.NORTH);
        getContentPane().add(progressBar2, BorderLayout.CENTER);
        getContentPane().add(progressBar3, BorderLayout.SOUTH);
        getContentPane().add(progressBar4, BorderLayout.AFTER_LAST_LINE);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      Thread threadA = new Thread(new MyThread(progressBar));
      Thread threadB = new Thread(new MyThread(progressBar2));
      Thread threadC = new Thread(new MyThread(progressBar3));
      Thread threadD = new Thread(new MyThread(progressBar4));

      setPriority("threadA ",5,threadA);
        setPriority("threadB ",5,threadB);
        setPriority("threadC ",4,threadC);
        setPriority("threadD ",3,threadD);

    }

    public static void setPriority(String threadName,int priority,Thread t)
    {
        t.setPriority(priority);
        t.setName(threadName);
        t.start();
    }

    private  final  class MyThread implements Runnable{

        private final JProgressBar bar;
        int count =0;
        private  MyThread(JProgressBar bar)
        {
            this.bar = bar;
        }

        @Override
        public void run() {
            while (true)
            {
                bar.setValue(count+=10);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.print("当前线程被中断");
                  //  e.printStackTrace();
                }
            }
        }
    }
}
