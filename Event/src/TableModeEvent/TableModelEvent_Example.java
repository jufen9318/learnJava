package TableModeEvent;

import javafx.embed.swing.JFXPanel;

import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TableModelEvent_Example extends JFrame {
    private JTable table;
    private DefaultTableModel tableModel;
    private JTextField aTextField;
    private JTextField bTextField;

    public TableModelEvent_Example()
    {
        super();
        setTitle("表格模型事件示例");
        setBounds(100,100,600,450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final JScrollPane scrollPane = new JScrollPane();
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        String [] columnNames ={"A","B"};
        String [][] rowValues ={{"A1","B1"},{"A2","B2"},{"A3","B3"},{"A4","B4"}};
        tableModel = new DefaultTableModel(rowValues,columnNames);
        tableModel.addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                int type =e.getType();
                int row = e.getFirstRow() +1;
                int column = e.getColumn() +1;
                if(type==TableModelEvent.INSERT)
                {
                    System.out.print("此次事件有 插入 行触发，");
                    System.out.println("此次插入的是第 "+ row + " 行！");
                }
                else if(type == TableModelEvent.UPDATE)
                {
                    System.out.print("此次事件由 修改 行触发，");
                    System.out.println("此次修改的是第 "+ row + " 行 第" + column + "列！");
                }
                else if (type == TableModelEvent.DELETE)
                {
                    System.out.print("此次事件由 删除 行触发，");
                    System.out.println("此次删除的是第 "+ row + " 行！");
                }
                else {
                    System.out.println(" 此次事件由 其他原因 触发！");
                }
            }
        });



        table = new JTable(tableModel);
        scrollPane.setViewportView(table);
        final JPanel panel = new JPanel();
        getContentPane().add(panel,BorderLayout.SOUTH);
        final JLabel aLable = new JLabel("A:");
        panel.add(aLable);
        aTextField = new JTextField(15);
        panel.add(aTextField);
        final JLabel bLable = new JLabel("B:");
        panel.add(bLable);
        bTextField = new JTextField(15);
        panel.add(bTextField);
        final JButton addButton = new JButton("添加");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String [] rowValues = {aTextField.getText(),aTextField.getText()};
                tableModel.addRow(rowValues);
                aTextField.setText(null);
                bTextField.setText(null);
            }
        });

        panel.add(addButton);
        final JButton delButton = new JButton("删除");
        delButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int[] selectRows = table.getSelectedRows();
                for(int row =0;row <selectRows.length;row++)
                {
                    tableModel.removeRow(selectRows[row]-row);
                }
            }
        });

        panel.add(delButton);

    }


}
