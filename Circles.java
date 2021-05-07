

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import java.awt.Graphics;

public class Circles extends JPanel 
{

public void paintComponent(Graphics g)
   {
    super.paintComponent(g);

    g.setcolor(Color.PINK);
    g.fillOval(10,10,200,200);
    g.setcolor(Color.BLUE);
    g.fillOval(50,50,100,100);
    g.setColor(Color.BLUE);
    g.fillrect(50,110,120,30);
    g.fillOval(50, 120,120,40);
    

   }
}