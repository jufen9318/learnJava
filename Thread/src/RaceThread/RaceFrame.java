package RaceThread;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RaceFrame extends JFrame {
    private  JTextArea jTextArea1,jTextArea2;
    private  JLabel jLabel1,jLabel2;
    private JButton jButton1;
    public  RaceFrame()
    {

        setSize(500,500);
        jLabel1= new JLabel("兔子的比赛记录");
        jLabel2 = new JLabel("乌龟的比赛记录");

        JPanel jPanel1 =new JPanel();
        jPanel1.add(jLabel1);
        jPanel1.add(jLabel2);

        getContentPane().add(jPanel1, BorderLayout.NORTH);

        jTextArea1 = new JTextArea(20,20);
        jTextArea2 = new JTextArea(20,20);
        JPanel jPanel2 = new JPanel();
        jPanel2.add(jTextArea1,BorderLayout.EAST);
        jPanel2.add(jTextArea2,BorderLayout.EAST);
        getContentPane().add(jPanel2, BorderLayout.CENTER);

        jButton1 = new JButton("比赛开始");
        getContentPane().add(jButton1, BorderLayout.SOUTH);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ///为什么要将Runnable接口的子类对象传递给Thread的构造
                Thread thread1 = new Thread(new Rabbit());
                Thread thread2 = new Thread(new Tortoise());

                thread1.start();
                thread2.start();
            }
        });
    }

    ///兔子
    public  class Rabbit implements Runnable {
        @Override
        public void run() {
                for(int i =1;i<11;i++)
                {
                    String text = jTextArea1.getText();
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    jTextArea1.setText(text + " 兔子跑了"+ i + "0米\n");
                    if(i==9)
                    {
                        jTextArea1.setText(text + " 兔子在睡觉\n");
                        try {
                            Thread.sleep(10000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    if(i==10)
                    {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        jTextArea1.setText(text + " 兔子在到达终点\n");
                    }
                }
        }
    }

    //乌龟
    public  class Tortoise implements Runnable{

        @Override
        public void run() {
            for(int i =1;i<11;i++) {
                String text = jTextArea2.getText();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                jTextArea2.setText(text + " 乌龟跑了"+ i + "0米\n");
                if(i==10)
                {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    jTextArea2.setText(text + " 乌龟在到达终点\n");
                }
            }
        }
    }
}
