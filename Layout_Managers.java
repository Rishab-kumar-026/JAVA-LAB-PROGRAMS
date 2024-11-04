import javax.swing.*;
import java.awt.*;

class LayoutManagerExample{
    public static void main (String[] args){
        JFrame frame = new JFrame("Layout Manager Examples");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        JPanel flowPanel = new JPanel(new FlowLayout());
        flowPanel.add(new JButton("Button 1"));
        flowPanel.add(new JButton("Button 2"));
        flowPanel.add(new JButton("Button 3"));
        flowPanel.add(new JButton("Button 4"));

         JPanel borderPanel = new JPanel(new BorderLayout());
         borderPanel.add(new JButton("North"),BorderLayout.NORTH);
         borderPanel.add(new JButton("South"),BorderLayout.SOUTH);
         borderPanel.add(new JButton("East"),BorderLayout.EAST);
         borderPanel.add(new JButton("West"),BorderLayout.WEST);
         borderPanel.add(new JButton("Center"),BorderLayout.CENTER);

          JPanel gridPanel = new JPanel(new GridLayout(2,2));
          gridPanel.add(new JButton("Button 1"));
          gridPanel.add(new JButton("Button 2"));
          gridPanel.add(new JButton("Button 3"));
          gridPanel.add(new JButton("Button 4"));

          frame.setLayout(new GridLayout(3,1));
          frame.add(flowPanel);
          frame.add(borderPanel);
          frame.add(gridPanel);
          frame.setVisible(true);
    }
}