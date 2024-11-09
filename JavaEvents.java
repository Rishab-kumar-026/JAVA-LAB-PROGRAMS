import javax.swing.*;
import java.awt.event.*;
import java.lang.String;
class KeyEventExample extends JFrame implements KeyListener{
public KeyEventExample(){
setTitle("Key Event Example");
setSize(400,400);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
addKeyListener(this);
setVisible(true);
}
public void keyPressed(KeyEvent e){
System.out.println("Key Pressed : " + e.getKeyChar());
}
public void keyReleased(KeyEvent e){
System.out.println("Key Released : " + e.getKeyChar());
}
public void keyTyped(KeyEvent e){
System.out.println("Key Typed : " + e.getKeyChar());
}
public static void main(String[] args){
new KeyEventExample();
}
}