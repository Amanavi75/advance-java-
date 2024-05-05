package shape;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;

public class s1 implements KeyListener{
    JFrame f;
    JLabel l;
    JTextArea ta;
    s1()
    {
    f=new JFrame("KeyEvent application");
    l=new JLabel();
    l.setBounds(180,130,200,30);
    l.setForeground(Color.white);
    ta=new JTextArea();
    ta.setBounds(50,30,300,100);
    ta.addKeyListener(this);
    f.add(l);
    f.add(ta);
    f.setSize(400,400);
    f.setResizable(false);
    f.setLocationRelativeTo(null);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.getContentPane().setBackground(new Color(89,129,110));
    f.setLayout(null);
    f.setVisible(true);
    }
    public void keyPressed(KeyEvent e)
    {
    l.setText("Key Pressed event");
    }
    public void keyReleased(KeyEvent e)
    {
    l.setText("Key Released event");
    }
    public void keyTyped(KeyEvent e)
    {
    l.setText("Key Typed event");
    }
    public static void main(String args[])
    {
    new s1 ();
    }
    }
