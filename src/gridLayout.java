import javax.swing.*;
import java.awt.*;

public class gridLayout {
    JFrame f;
    gridLayout(){
        f =new JFrame("GridLayout application");
        JButton b1 = new JButton("1");
        b1.setBounds(15, 20, 50, 30);
        JButton b2 = new JButton("2");
        b2.setBounds(20, 20, 50, 30);
        JButton b3 = new JButton("3");
        b3.setBounds(25, 20, 50, 30);
        JButton b4 = new JButton("4");
        b4.setBounds(30, 20, 50, 30);
        JButton b5 = new JButton("5");
        b5.setBounds(35, 20, 50, 30);
        JButton b6 = new JButton("6");
        b6.setBounds(40, 20, 50, 30);
        JButton b7 = new JButton("7");
        b7.setBounds(45, 20, 50, 30);
        JButton b8 = new JButton("8");
        b8.setBounds(50, 20, 50, 30);
        JButton b9 = new JButton("9");
        b9.setBounds(55, 20, 50, 30);
        JButton b0 = new JButton("0");
        b0.setBounds(60, 20, 50, 30);


        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(b0);
        f.setSize(400, 400);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.getContentPane().setBackground(new Color(89, 129, 110));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setLayout(new GridLayout(3,2));
    }

    public static void main(String[] args) {
        new gridLayout();
    }
}
