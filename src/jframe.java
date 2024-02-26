import javax.swing.*;
import java.awt.Color;
class jframe
{
public static void main(String... shruti)
{
JFrame f=new JFrame("This is my first frame");
f.setSize(400,500);
f.setResizable(false);
f.setLocationRelativeTo(null);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
//f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
//f.getContentPane().setBackground(Color.red);
f.getContentPane().setBackground(new Color(0,110,110));

f.setLayout(null);
f.setVisible(true);
}
}
