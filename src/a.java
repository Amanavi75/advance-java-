import javax.swing.*;
import java.awt.Color;
class a
{
public static void main(String... shruti)
{
JFrame f=new JFrame("Button application");
JButton b=new JButton("Click on me");
b.setBounds(60,60,100,150);
b.setBackground(Color.yellow);
b.setForeground(Color.red);
f.add(b);
f.setSize(500,500);
f.setResizable(false);
f.setLocationRelativeTo(null);
f.getContentPane().setBackground(new Color(0,110,110));
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setLayout(null);
f.setVisible(true);
}
}