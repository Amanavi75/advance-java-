import java.awt.event.*;
import java.awt.*;
class mouseddragged extends Frame implements MouseMotionListener
{
    mouseddragged()
{
addMouseMotionListener(this);
setSize(500,500);
setLocationRelativeTo(null);
setLayout(null);
setVisible(true);
}
public void mouseDragged(MouseEvent e)
{
Graphics g=getGraphics();
g.setColor(new Color(190,160,150));
g.fillOval(e.getX(),e.getY(),30,20);
}
public void mouseMoved(MouseEvent e)
{ }
public static void main(String args[])
{
new mouseddragged();
}
}