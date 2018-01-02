package student;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class SimpleFrame extends JFrame {

    private  static  final int d = 800;
    private  static  final int h = 800;

    TextField textField = new TextField();
    List<String> arrayList = new ArrayList<String>();
    JScrollPane jsp;
    JList list = new JList();
    JButton addButton = new JButton("添加");
    JButton deleteButton = new JButton("删除");
    //List list = new List();

    public SimpleFrame() {
        setSize(d, h);
        list.setVisibleRowCount(30);
        jsp = new JScrollPane(list);
        setLayout(new FlowLayout());
        textField.setColumns(100);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                do_button_actionPerformed( e);
            }
        });
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                do_button_1_actionPerformed( e);
            }
        });

        add(textField);
        add(jsp);
        add(addButton);
        add(deleteButton);
    }

    protected void do_button_1_actionPerformed(ActionEvent e)
    {
        Object value =list.getSelectedValue();
        arrayList.remove(value);
        replaceModel();
    }


    protected void do_button_actionPerformed(ActionEvent e)
    {
        textField.requestFocusInWindow();
        textField.selectAll();

        String text = textField.getText();
        if(text.isEmpty())
        {
            return;
        }
        text.trim();
        arrayList.add(text);
        replaceModel();
    }

    private void replaceModel()
    {

        list.setModel(new AbstractListModel() {
            @Override
            public int getSize() {
                return  arrayList.size();
            }

            @Override
            public Object getElementAt(int index) {
              return arrayList.get(index);
            }
        });
    }
}
