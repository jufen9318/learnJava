package JScrollPane;

import javafx.embed.swing.JFXPanel;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class JScrollPaneDemo extends JFrame {
    private JPanel contentPane;
    private JScrollPane scrollPane;
    private JTextArea textArea;


    public JScrollPaneDemo( ) {
       contentPane = new JPanel();
       contentPane.setBorder(new EmptyBorder(5,5,5,5));
       contentPane.setLayout(new BorderLayout(0,0));
       this.setContentPane(contentPane);
       scrollPane = new JScrollPane();
       contentPane.add(scrollPane,BorderLayout.CENTER);
       textArea = new JTextArea();

        textArea.addKeyListener(new KeyListener() {
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
                            default:
                                System.out.println("wuf");
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
        });
       scrollPane.setViewportView(textArea);
       this.setTitle("滚动面板使用");
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setBounds(100,100,250,200);
       this.setVisible(true);
    }

    public static void main(String args[])
    {
        JScrollPaneDemo example = new JScrollPaneDemo();
    }
}
