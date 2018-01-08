package ThreadPriorityTest;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Frame extends JFrame {
    private DefaultTableModel tableModel;
    private  JTable table ;
    private TextField textField;
    public Frame (){
        JButton button = new JButton("修改");
        JLabel label = new JLabel("新优先级（1-10）");
        table = new JTable();
        textField = new TextField();
        setSize(500,500);

        JPanel jPanel = new JPanel();
        jPanel.add(label);
        jPanel.add(textField);
        jPanel.add(button);

        getContentPane().add(table,BorderLayout.CENTER);
        getContentPane().add(jPanel,BorderLayout.SOUTH);
//        String [] columnNames ={"A","B"};
//        String [][] rowValues =null;
//        tableModel = new DefaultTableModel(rowValues,columnNames);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                do_button_actionPerformed(actionEvent);
            }
        });

       this.addWindowListener(new WindowListener() {
           @Override
           public void windowOpened(WindowEvent windowEvent) {

           }

           @Override
           public void windowClosing(WindowEvent windowEvent) {

           }

           @Override
           public void windowClosed(WindowEvent windowEvent) {

           }

           @Override
           public void windowIconified(WindowEvent windowEvent) {

           }

           @Override
           public void windowDeiconified(WindowEvent windowEvent) {

           }

           @Override
           public void windowActivated(WindowEvent windowEvent) {
               do_this_windowActivated(windowEvent);
           }

           @Override
           public void windowDeactivated(WindowEvent windowEvent) {

           }
       });

    }


    protected  void do_this_windowActivated(WindowEvent e)
    {
        ThreadGroup group = Thread.currentThread().getThreadGroup();
        Thread[] threads= new Thread[group.activeCount()];
        group.enumerate(threads);
        DefaultTableModel model= (DefaultTableModel)table.getModel();
        model.setColumnCount(0);
        model.setColumnIdentifiers(new Object[]{"线程id","线程名称","优先级"});
        for(Thread thread:threads)
        {
            model.addRow(new Object[]{thread.getId(),thread.getName(),thread.getPriority()});
            ;
        }
        table.setModel(model);
    }

    protected  void do_button_actionPerformed(ActionEvent e)
    {
        String text = textField.getText();
        Integer priorit  = Integer.parseInt(text);
        int selectdRow = table.getSelectedRow();
        DefaultTableModel model  = (DefaultTableModel) table.getModel();
        model.setValueAt(priorit,selectdRow,2);
        repaint();
    }
}
