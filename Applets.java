import javax.swing.*;
import java.awt.*;
import java.lang.String;
class HelloApplet extends JPanel{
public void paintComponent(Graphics g){
super.paintComponent(g);
g.drawString("Hello JFrame !!! Welcome to Java Programming ", 50,100);
}
public static void main(String[] args){
JFrame frame = new JFrame("Applets Example in JFrame");
HelloApplet applet = new HelloApplet();
frame.add(applet);
frame.setSize(500,500);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
}
}