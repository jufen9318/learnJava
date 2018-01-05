package findText;

import com.sun.glass.ui.Size;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.*;

public class frame extends JFrame {
    private  static  final int d = 700;
    private  static  final int h = 300;
    JTextField beforeTextField,afterTextField;
    JLabel label3;

    String textFile="test.text";
    public frame()  {
        this.setTitle("替换文本");
        setSize(d,h);
        setLayout(null);

        JLabel label1,label2;
        label3 = new JLabel(textFile);
        label3.setBounds(10,5,600,30);
        label1 = new JLabel("替换前字符串");
        label2 = new JLabel("替换后字符串");
        label1.setBounds(10,30,100,30);
        label2.setBounds(10,80,100,30);
        add(label1);
        add(label2);
        add(label3);


        beforeTextField = new JTextField();
        afterTextField =  new JTextField();
        beforeTextField.setBounds(100,30,200,30);
        afterTextField.setBounds(100,80,200,30);
        add(beforeTextField);
        add(afterTextField);


        JButton button1,button2;
        button1 = new JButton("选择文件");
        button2 = new JButton("开始替换");
        button1.setBounds(350,30,200,30);
        button2.setBounds(350,80,200,30);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                do_selectButton_actionPerFormed(e);
            }
        });
        button1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                  do_replaceButton_actionPerFormed( e);
            }
        });
        add(button1);
        add(button2);
    }


    protected  void do_selectButton_actionPerFormed(ActionEvent e)
    {
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        chooser.setMultiSelectionEnabled(false);
        int result = chooser.showOpenDialog(this);
        if(result==JFileChooser.APPROVE_OPTION)
        {
            textFile= chooser.getSelectedFile().getPath();
            label3.setText(textFile);
            System.out.println(textFile);
        }
    }

    protected  void do_replaceButton_actionPerFormed(ActionEvent e)
    {
        String before = beforeTextField.getText();
        String after = afterTextField.getText();

        FileReader reader = null;
        FileWriter writer =null;
        StringBuilder sb = new StringBuilder();
        int flag =0;
        char[] temp = new char[1024];
        try
        {
            reader = new FileReader(textFile);
            while ((flag = reader.read(temp))!=-1)
            {
                sb.append(temp);
            }
            String content = sb.toString().replace(before,after);
            writer = new FileWriter(textFile);
            writer.write(content);
            reader.close();
            writer.close();
        }
        catch (FileNotFoundException e1)
        {
            e1.printStackTrace();
        }
        catch (IOException e1)
        {
            e1.printStackTrace();
        }
        finally {

        }
        JOptionPane.showMessageDialog(this,"success");
        return;
    }
}
