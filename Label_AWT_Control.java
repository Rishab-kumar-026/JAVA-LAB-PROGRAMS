import java.awt.*;
import java.awt.event.*;

class LabelExample{
      public static void main(String[] args){
        Frame frame = new Frame("Label Example");
        Label label = new Label("Hello Java Welcome to the Programming world!!!");
        label.setBounds(50,100,200,30);
        label.setForeground(Color.BLUE);
        frame.add(label);
        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {  // Using WindowAdapter instead
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
      }
}
