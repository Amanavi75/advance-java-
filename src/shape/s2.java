package shape;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;
class s2
{
s2()
{
JFrame f=new JFrame("Combo Box color");
String color[]={"Red","Green","Blue","Black","Magenta","Cyan","Yellow"};
JComboBox<String> cb=new JComboBox<String>(color);
cb.setBounds(15,20,80,30);
cb.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
String s=(String)cb.getSelectedItem();
switch(s)
{
case "Red":
f.getContentPane().setBackground(Color.red);
break;
case "Green":
f.getContentPane().setBackground(Color.green);
break;
case "Blue":
f.getContentPane().setBackground(Color.blue);
break;
case "Black":
f.getContentPane().setBackground(Color.black);
break;
case "Magenta":
f.getContentPane().setBackground(Color.magenta);
break;
case "Cyan":
f.getContentPane().setBackground(Color.cyan);
break;
case "Yellow":
f.getContentPane().setBackground(Color.yellow);
break;}}});
f.add(cb);
f.setSize(400,400);
f.setResizable(false);
f.setLocationRelativeTo(null);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setLayout(null);
f.setVisible(true);}
public static void main(String args[]){
new s2();}}