package Camera;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BackgroundFrame extends JFrame {

    private JLabel label;
    public BackgroundFrame(){
        super();
        setResizable(false);
        getContentPane().setLayout(null);
        setTitle("方向键移动背景");
        setBounds(100,100,800,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        label = new JLabel();
        ImageIcon icon = new ImageIcon(getClass().getResource("Backgrou.jpg"));
        ImageIcon glasssImg = new ImageIcon(getClass().getResource("glass.png"));
        glasssImg.setImage(glasssImg.getImage().getScaledInstance(350, 350,Image.SCALE_DEFAULT));
        //ImageIcon glasssImg =new ImageIcon(glasssImg2.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT));
        label.setIcon(icon);
        label.setSize(icon.getIconWidth(),icon.getIconHeight());
        label.setLocation(-icon.getIconWidth()/3,-icon.getIconHeight()/3);
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                do_lable_keyiPressed(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });


        getContentPane().add(label);
        JLabel glassLable = new JLabel(glasssImg);
        JPanel glassPane = new JPanel(new BorderLayout());
        glassPane.add(glassLable,BorderLayout.CENTER);
        glassPane.setOpaque(false);
        setGlassPane(glassPane);
        getGlassPane().setVisible(true);

    }


    protected  void do_lable_keyiPressed(final KeyEvent e)
    {
        int code = e.getKeyCode();
        Point location = label.getLocation();
        int step = 3;
        switch (code)
        {
            case KeyEvent.VK_RIGHT:
                if(location.x > (getWidth()-label.getWidth()))
                {
                    label.setLocation(location.x - step,location.y);
                }
                break;
            case KeyEvent.VK_LEFT:
                if(location.x<0)
                    label.setLocation(location.x + step,location.y);
                break;
            case KeyEvent.VK_DOWN:
                if(location.y>(getWidth()-label.getHeight()))
                    label.setLocation(location.x,location.y-step);
                break;
            case  KeyEvent.VK_UP:
                if(location.y<0)
                    label.setLocation(location.x,location.y+step);
                break;
                default:break;
        }
    }
}
