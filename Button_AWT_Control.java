import java.awt.*;
import java.awt.event.*;

class ButtonExample extends Frame {
    public ButtonExample() {
        Button btn = new Button("Click Me");
        btn.setBounds(100, 100, 80, 30);
        btn.setBackground(Color.RED);
        btn.setForeground(Color.WHITE);
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Clicked");
            }
        });
        add(btn);
        setSize(300, 200);
        setLayout(null);
        setVisible(true);

        addWindowListener(new WindowAdapter() {  // Using WindowAdapter instead
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new ButtonExample();
    }
}
