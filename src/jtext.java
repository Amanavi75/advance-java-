import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.*;

class jtext {
  public static void main(String[] args) {
    JFrame f = new JFrame("Calculator");
    JLabel l1 = new JLabel("First number");
    l1.setBounds(20, 30, 100, 30);
    JTextField tf1 = new JTextField();
    tf1.setBounds(140, 30, 100, 30);
    JLabel l2 = new JLabel("Second number");
    l2.setBounds(20, 90, 100, 30);
    JTextField tf2 = new JTextField();
    tf2.setBounds(140, 90, 100, 30);
    
    JTextField tf3 = new JTextField();
    tf3.setEditable(false); //  this method will allow us to edit the required textField
    tf3.setBounds(20, 320, 100, 30);
    
    JButton b = new JButton("+");
    b.setBounds(20, 150, 50, 30);
    b.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        String s1 = tf1.getText();
        String s2 = tf2.getText();
        int a = Integer.parseInt(s1);
        int b1 = Integer.parseInt(s2);
        int c = 0;
        if (event.getSource() == b) {
          c = a + b1;
        }
        String result = String.valueOf(c);
        tf3.setText(result);
      }
    });

    JButton b2 = new JButton("-");
    b2.setBounds(20, 190, 50, 30);

    b2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            String s1 = tf1.getText();
        String s2 = tf2.getText();
        int a = Integer.parseInt(s1);
        int b1 = Integer.parseInt(s2);
        int c = 0;
        if (e.getSource() == b2) {
          c = a - b1;
        }
        String result = String.valueOf(c);
        tf3.setText(result);
        }
    });



    JButton b3 = new JButton("*");
    b3.setBounds(20, 230, 50, 30);

    b3.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent f){
            String s1 = tf1.getText();
        String s2 = tf2.getText();
        int a = Integer.parseInt(s1);
        int b1 = Integer.parseInt(s2);
        int c = 0;
        if (f.getSource() == b3) {
          c = a * b1;
        }
        String result = String.valueOf(c);
        tf3.setText(result);
        }
    });


    JButton b4 = new JButton("/");
    b4.setBounds(20, 270, 50, 30);

    b4.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent g){
            String s1 = tf1.getText();
        String s2 = tf2.getText();
        int a = Integer.parseInt(s1);
        int b1 = Integer.parseInt(s2);
        int c = 0;
        if (g.getSource() == b4) {
          c = a / b1;
        }
        String result = String.valueOf(c);
        tf3.setText(result);
        }
    });
    

    f.add(l1);
    f.add(tf1);
    f.add(l2);
    f.add(tf2);
    f.add(b);
    f.add(tf3);
    f.add(b2);
    f.add(b3);
    f.add(b4);
    
    f.setSize(600,600);
    f.setLocationRelativeTo(null);
    f.setResizable(false);
    f.setLayout(null);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}