package frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Set;

public class SimpleFrame extends JFrame {
 private  static  final int d = 300;
 private  static  final int h = 200;


    JComboBox comboBox = new JComboBox(getProvince());
    JComboBox cityComboBox = new JComboBox();

 public SimpleFrame()
 {
     setSize(d,h);
     TextField i1;
     i1= new TextField(10);
     setLayout(new FlowLayout());
     add(i1);
     getProvince();
  //   comboBox.chan
    // comboBox(getProvince());
    // JComboBox
     //comboBox.add
     comboBox.addItemListener(new ItemListener() {
         @Override
         public void itemStateChanged(ItemEvent e) {
             itemChange();
         }
     });
     add(comboBox);
     add(cityComboBox);
 }


    public  Object[] getProvince()
    {
        java.util.Map<String, String[]> map= CityMap.model;
        Set<String> set = map.keySet();
        Object[] province = set.toArray();
        return  province;
    }

    private void itemChange()
    {
        String selectProvince = (String) comboBox.getSelectedItem();
        cityComboBox.removeAllItems();
        String[] arryCity = getCity(selectProvince);
         cityComboBox.setModel(new DefaultComboBoxModel(arryCity));
    }

    public String[] getCity(String selectProvince)
    {
        java.util.Map<String,String[]> map = CityMap.model;
        String[] arrCity = map.get(selectProvince);
        return  arrCity;
    }
}
