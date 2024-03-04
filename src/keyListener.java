import javax.swing.*;
import java.awt.*;
import java.awt.Color.*;
import java.awt.event.*;

class keyListener implements KeyListener {
    JFrame f;
    JLabel l;
    JTextArea ta;

    keyListener(){
        f = new JFrame("KeyListner ");
        l  = new JLabel();
        l.setBounds(180, 130, 200, 30);
        l.setForeground(Color.WHITE);
        ta= new JTextArea();
        ta.setBounds(50, 30, 300, 100);

        ta.addKeyListener(this);
        f.add(l);
        f.add(ta);
        f.setSize(400,400);
        f.setResizable(false);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().setBackground(new Color(89,129,110));
        f.setLocationRelativeTo(null);
    }

    public void keyPressed(KeyEvent e){
        l.setText("KeyPressed event");

    }
    public void keyReleased(KeyEvent e){
        l.setText("key released");
    }
    public void keyTyped(KeyEvent e){
        l.setText("key typed event");
    }
    public static void main(String[] args) {
        new keyListener();
    }
}
