import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class colorChanger {
    colorChanger(){
        JFrame f = new JFrame("colorchangerusing combobox");
        String color[] = {"red","green","blue","cyan","yellow"};
        JComboBox<String> cb = new JComboBox<String>(color);
        cb.setBounds(15, 20, 80, 30);
        cb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                   String s = (String)cb.getSelectedItem();
                   switch(s){
                    case "Red":
                    f.getContentPane().setBackground(Color.RED);
                    case "Green":
                    f.getContentPane().setBackground(Color.GREEN);
                    case "blue":
                    f.getContentPane().setBackground(Color.BLUE);
                    case "cyan":
                    f.getContentPane().setBackground(Color.CYAN);
                    case "yellow":
                    f.getContentPane().setBackground(Color.YELLOW);
                   }
            }
        });
    }

    public static void main(String[] args) {
        new colorChanger();
    }
}
