package DisplayFile;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class fileframe extends JFrame {
    private  static  final int d = 600;
    private  static  final int h = 500;
    TextField textField;
    JTable table;
    JButton addButton = new JButton("选择文件夹");

    public fileframe()  {
        this.setTitle("选择文件夹");
        setSize(d,h);
      //  setLayout(new FlowLayout());
        setLayout(null);

       // table.addColumn(5);
        textField= new TextField(10);
        textField.setBounds(20,10,300,30);
        addButton.setBounds(400,10,100,30);
        table = new JTable(){
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        table.setPreferredScrollableViewportSize(new Dimension(500, 300));
        table.setFillsViewportHeight(true);
        //Create the scroll pane and add the table to it.

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        String[] columnNames = {"文件名",
                "文件大小",
                "修改时间"};
        Object[][] data =null;
//        Object[][] data = {
//                {"Kathy", "Smith",
//                        "Snowboarding", new Integer(5), new Boolean(false)},
//                {"John", "Doe",
//                        "Rowing", new Integer(3), new Boolean(true)},
//                {"Sue", "Black",
//                        "Knitting", new Integer(2), new Boolean(false)}
//        };
        model.setDataVector(data, columnNames);
        table.setModel(model);
        table.setBackground(Color.YELLOW);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(20,60,500,300);
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                do_button_actionPerformed( e);
            }
        });
        add(scrollPane);
        add(textField);
        this.add(addButton);

    }


    protected  void do_button_actionPerformed(ActionEvent e)
    {
        final String fileType = textField.getText();
        if(fileType.isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Please input file type","",JOptionPane.WARNING_MESSAGE);
            return;
        }
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setMultiSelectionEnabled(false);
        int result = chooser.showOpenDialog(this);
        if(result==JFileChooser.APPROVE_OPTION)
        {
            File[] listFiles = chooser.getSelectedFile().listFiles(new java.io.FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.getName().endsWith(fileType)) {
                    return true;
                } else {
                    return false;
                }
            }
             });
           DefaultTableModel model = (DefaultTableModel) table.getModel();
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            for(File file:listFiles)
            {
                String name = file.getName();
                long size = file.length();
                String modifyDate = format.format(new Date(file.lastModified()));
                model.addRow(new String[] {name,"" + size,modifyDate});
            }

            table.setModel(model);
        }
    }
}
