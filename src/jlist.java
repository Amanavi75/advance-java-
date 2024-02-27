import javax.swing.*;
import java.awt.event.*;
public class jlist {
JFrame f;
jlist(){
    f = new JFrame("jList application ");
    DefaultListModel<String> con = new DefaultListModel<>();
    con.addElement("india");
    con.addElement("canada ");
    con.addElement("australia ");
    con.addElement("united states ");
    con.addElement("nepal");
    con.addElement("germany");

    JList<String> li = new JList<>(con);
    li.setBounds(40, 40, 100, 90);
    JLabel l = new JLabel();
    l.setBounds(10, 20, 200, 30);

    JButton b = new JButton("Country");
    b.setBounds(180, 100, 90, 30);
    b.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            String data = "";
            if(li.getSelectedIndex()!=-1){ 
                //* -1 means that the data is not selected */
                data = "selected Country is:-"+li.getSelectedValue();
            }
            l.setText(data);
        }
    });

    f.add(li);
    f.add(l);
    f.add(b);
    f.setSize(400,400);
    f.setResizable(false);
    f.setLocationRelativeTo(null);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setLayout(null);
    f.setVisible(true);
}
public static void main(String[] args) {
    new jlist();
}
    
}