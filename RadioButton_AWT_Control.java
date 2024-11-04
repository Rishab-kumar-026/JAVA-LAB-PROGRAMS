import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class RadioButtonExample{
    public static void main(String[] args){
        JFrame frame = new JFrame("Radio Button Example");
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JRadioButton rb1 = new JRadioButton("Male");
        JRadioButton rb2 = new JRadioButton("Female");
        JRadioButton rb3 = new JRadioButton("Others");

        rb1.setBounds(50,50,100,30);
        rb2.setBounds(50,100,100,30);
        rb3.setBounds(50,150,100,30);

        rb1.setBackground(Color.RED);
        rb1.setForeground(Color.WHITE);
        rb2.setBackground(Color.RED);
        rb2.setForeground(Color.WHITE);
        rb3.setBackground(Color.RED);
        rb3.setForeground(Color.WHITE);        

        ButtonGroup group = new ButtonGroup();
        group.add(rb1);
        group.add(rb2);
        group.add(rb3);

        rb1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Male option Selected");
            }
        });
         rb2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Female option Selected");
            }
        });
         rb3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Others option Selected");
            }
        });

        frame.add(rb1);
        frame.add(rb2);
        frame.add(rb3);
        frame.setVisible(true);
    }
}