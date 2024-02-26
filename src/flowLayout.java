import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.Color;
class flowLayout{
public static void main(String... shruti)
{
JFrame f=new JFrame("FlowLayout");

JButton b1=new JButton("1");
b1.setBounds(20,150,50,30);
JButton b2=new JButton("2");
b2.setBounds(25,150,50,30);
JButton b3=new JButton("3");
b3.setBounds(30,150,50,30);
JButton b4=new JButton("4");
b4.setBounds(35,150,50,30);

f.add(b1);
f.add(b2);
f.add(b3);
f.add(b4);
f.setSize(400,500);
f.setResizable(false);
f.setLocationRelativeTo(null);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.getContentPane().setBackground(Color.green);
f.setLayout(new FlowLayout(FlowLayout.RIGHT,100,120));
f.setVisible(true);
}
}