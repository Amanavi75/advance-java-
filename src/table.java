import javax.swing.*;

public class table {
    JFrame f;
    table(){

        f = new JFrame("JTable control");
        String data[][] = {{"101","aman","3467"},{"102","robbin","5467"},{"103","suman","8976"},{"104","aditya","7667"}};
        String column[] = {"empid","empName","empSal"};
        JTable tb = new JTable(data,column);
        tb.setBounds(30, 90, 140, 400);
        JScrollPane sp = new JScrollPane(tb);
        sp.setBounds(30, 40, 160, 100);
        f.add(tb);
        f.add(sp);
        f.setSize(400,400);
        f.setResizable(false);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new table();
    }
}
