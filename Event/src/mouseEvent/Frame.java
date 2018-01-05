package mouseEvent;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;

public class Frame extends JFrame {
    public  Frame()
    {
        setSize(500,500);
        Container contentPane = getContentPane();
         JLabel label = new JLabel();
        label.setText("Mark:");
        label.setBounds(10,10,100,10);
        add(label);
       // getContentPane().add(label);
        contentPane.add(label, BorderLayout.WEST);
        //   contentPane.setBorder(new EmptyBorder(5,5,5,5));
        //    contentPane.setLayout(new BorderLayout(0,0));
        //   this.setContentPane(contentPane);
        // contentPane.setBounds(10,10,300,300);

        final JScrollPane scrollPane = new JScrollPane();
        contentPane.add(scrollPane,BorderLayout.CENTER);

        JTextArea textArea = new JTextArea();
        textArea.addKeyListener(textArea_Key());
        label.addMouseListener(labe_Mouse());

        textArea.setLineWrap(true);
        textArea.setRows(3);
        textArea.setColumns(15);
        scrollPane.setViewportView(textArea);
       // add(Container);
      //  add(scrollPane);
     ///  this.setBounds(100,100,250,250);
    }

    public  KeyListener textArea_Key()
    {
      return   new KeyListener(){
          @Override
          public void keyTyped(KeyEvent e) {
              System.out.println("此次输入的是:"+e.getKeyChar());
          }

          @Override
          public void keyPressed(KeyEvent e) {
              String keyText = KeyEvent.getKeyText(e.getKeyCode());
              if(e.isActionKey())
              {
                  System.out.println("你按下的是动作键："+keyText);
              }
              else
              {
                  System.out.println("你按下的是非动作键："+ keyText);
                  int keyCode = e.getKeyCode();
                  switch (keyCode)
                  {
                      case KeyEvent.VK_CONTROL:
                          System.out.println("Ctrl键被按下");
                          break;
                      case KeyEvent.VK_ALT:
                          System.out.println("Alt键被按下");
                          break;
                      case KeyEvent.VK_SHIFT:
                          System.out.println("Shift键被按下");
                          break;
                  }
                  System.out.println();
              }
          }

          @Override
          public void keyReleased(KeyEvent e) {
              String keyText = KeyEvent.getKeyText(e.getKeyCode());
              System.out.println("你释放的是：" + keyText );
              System.out.println();
          }
        };
    }


    public MouseListener labe_Mouse()
    {
        return new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.print("单击了鼠标按键");
                int i = e.getButton();
                if(i==MouseEvent.BUTTON1)
                {
                    System.out.print("单击的是鼠标左键");
                }
                if(i==MouseEvent.BUTTON2)
                {
                    System.out.print("单击的是鼠标滚轮");
                }
                if(i==MouseEvent.BUTTON3)
                {
                    System.out.print("单击的是鼠标右键");
                }
                int clickCount = e.getClickCount();

                System.out.println("单击次数为"+clickCount + "下");
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.print("鼠标按键被释放，");
                int i = e.getButton();
                if(i==MouseEvent.BUTTON1)
                {
                    System.out.print("被释放的是鼠标左键");
                }
                if(i==MouseEvent.BUTTON2)
                {
                    System.out.print("被释放的是鼠标滚轮");
                }
                if(i==MouseEvent.BUTTON3)
                {
                    System.out.print("被释放的是鼠标右键");
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("光标移入组件");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                    System.out.println("光标移除组件");
            }
        };
    }
}
