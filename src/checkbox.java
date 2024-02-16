import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;


public class checkbox {

    public static void main(String args[]){
        JFrame f = new JFrame("JcheckBox");
        JLabel l1 = new JLabel("ready to eat");

        l1.setBounds(20, 20, 160, 30);
        l1.setForeground(Color.blue);
        JCheckBox c1 = new JCheckBox("pizza .... Rs100");
        c1.setBounds(40, 50, 160, 30);
        JCheckBox c2 = new JCheckBox("Burger .... Rs150");
        c2.setBounds(40, 100, 160, 30);
        JCheckBox c3 = new JCheckBox("dosa .... Rs300");
        c3.setBounds(40, 150, 160, 30);
        JButton b = new JButton("Order");
        b.setBounds(220, 120, 100, 30);
        b.setForeground(Color.blue);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                float amount = 0;
                String msg = "";
                if(c1.isSelected()){
                    amount+=100;
                }
                if(c2.isSelected()){
                    amount+=150;
                }
                if(c3.isSelected()){
                    amount+=300;
                }
                
                msg = "Total amount will be" + amount;
                System.out.println(msg);
            }
        });
        f.add(l1);
        f.add(c1);
        f.add(c2);
        f.add(c3);
        f.add(b);

        f.setSize(600,600);
        f.setResizable(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().setBackground(Color.yellow);
        f.setLayout(null);
        f.setVisible(true);
    }
    
}