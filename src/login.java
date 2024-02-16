import java.awt.Color;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class login {
    public static void main(String[] args) {
        JFrame f = new JFrame("Login application");
        JLabel l1 = new JLabel("username");

        l1.setBounds(20, 20, 100, 30);
        l1.setForeground(Color.blue);

        JTextField tf = new JTextField();
        tf.setBounds(90, 20, 100, 30);
        tf.setForeground(Color.blue);

        JLabel l2 = new JLabel("password");

        l2.setBounds(100, 120, 100, 30);
        l2.setForeground(Color.blue);

        JPasswordField pf = new JPasswordField();
        pf.setBounds(90, 80, 100, 30);
        pf.setForeground(Color.blue);

        JLabel l3 = new JLabel();

        l3.setBounds(20, 200, 100, 30);
        l3.setForeground(Color.blue);

        JButton b = new JButton("Login");
        b.setBounds(220, 120, 100, 30);
        b.setForeground(Color.blue);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                l3.setText("welcome to" + " "+ tf.getText());

            }
        });

        f.add(l1);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(b);
        f.add(pf);
        f.add(tf);

        f.setSize(600,600);
        f.setResizable(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().setBackground(Color.yellow);
        f.setLayout(null);
        f.setVisible(true);
    }
}
