import javax.swing.*;
import java.awt.Graphics;
import java.awt.*;


class graphic extends Canvas {
    public void paint(Graphics g){

        Font font = new Font("Dialog",Font.BOLD,22);
        g.setFont(font);
        g.drawString("aman", 30, 20);
        setForeground(Color.BLUE);
        setBackground(Color.YELLOW);
        g.fillRect(70, 60, 150, 90);
        g.drawArc(20, 150, 70, 20, 30, 90);
        g.fillArc(60, 160, 100, 100, 130, 120);
        g.fillOval(90, 200, 120,100);
        
    }
    public static void main(String[] args) {
        graphic d = new graphic();
        JFrame f = new JFrame("Graphic application");
        f.add(d);
        f.setSize(600,600);
        f.setResizable(false);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
}
