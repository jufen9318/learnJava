package RenameFiles;

import javafx.scene.control.ChoiceBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileNotFoundException;

public class Frame extends JFrame {
    private  static  final int d = 700;
    private  static  final int h = 300;
    JTextArea textArea;
    JCheckBox checkBox = new JCheckBox();
    File[] selectFiles;

    public Frame()  {
        setSize(d,h);
        setLayout(null);
        JLabel label1,label2,label3,label4,label5,label6;
        label1 = new JLabel("选择的文件夹：");
        label2 = new JLabel("载取前字符：");


    }


    protected void do_renameButton_actionPerformed(ActionEvent e)
    {
        textArea.setText("");
        for(File selectFile:selectFiles)
        {
            String fileName = selectFile.getName();
            fileName = selectFile.getParent()+File.separator + fileName;
            if(checkBox.isSelected())
            {
                textArea.append(fileName+"\n\r");
                selectFile.renameTo(new File(fileName));
            }
            else
            {
                textArea.append(fileName+"\n\r");
            }
        }
    }
}
