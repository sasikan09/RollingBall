package Lib;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
    
public class RollingBall extends JPanel implements ActionListener{
     int x=100;
     int y=90;
     int startangle=0;
     public RollingBall(){
        Timer t = new Timer(100, this);
        t.start();
     }

public void paintComponent(Graphics g){
    super.paintComponent(g);
    g.drawOval(x, y, 80, 80);
    g.fillArc(x, y, 80, 80, startangle, 180);
}

@Override
public void actionPerformed(ActionEvent e) {
    x=x-2;
    startangle = startangle  +2;
    if(x== -80)x=getWidth();
    if(startangle==360)startangle = 0;
    repaint();

}
}



    
    

