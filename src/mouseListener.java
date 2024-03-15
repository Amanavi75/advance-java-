import java.awt.event.*;
import java.awt.*;
class mouseListener extends Frame implements MouseListener{

   mouseListener(){
    addMouseListener(this);
    setSize(500,500);
    setLocationRelativeTo(null);
    setLayout(null);
    setVisible(true);

   }

   public void mouseClicked(MouseEvent e){
    Graphics g = getGraphics();
    g.setColor(new Color(170,140,120));
    g.fillRect(e.getX(), e.getY(), 50, 20);
   }

   public void mousePressed(MouseEvent e){

   }
   public void mouseReleased(MouseEvent e){
    
   }
   public void mouseEntered(MouseEvent e){
    
   }
   public void mouseExited(MouseEvent e){
    
   }

   public static void main(String[] args) {
    new mouseListener();
   }

}