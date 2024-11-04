import java.awt.*;
import java.awt.event.*;

class CheckBoxExample {
    public static void main(String[] args) {
        Frame frame = new Frame("CheckBox Example");
        Checkbox checkbox = new Checkbox("Accept Terms & Conditions.."); // Corrected 'CheckBox' to 'Checkbox' (Java naming convention)
        checkbox.setBounds(100, 100, 250, 50);
        frame.add(checkbox);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);

        checkbox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {  // Corrected method name
                if (checkbox.getState()) {
                    System.out.println("CheckBox is Checked");
                } else {
                    System.out.println("CheckBox is Unchecked");
                }
            }
        });

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}
