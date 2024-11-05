import java.util.Scanner;
class Area{
int length;
int breadth;
int side;
double base,height;

 Area(int length , int breadth){
System.out.println("Area of Rectangle : " + (length*breadth)); 
}
 Area(int side){
System.out.println("Area of Square : " + (side*side)); 
}
Area(double base,double height){
System.out.println("Area of Triangle : " + (0.5 *base*height)); 
}
}

class main
{
public static void main(String[] args){

Area area1 = new Area(5,10);
Area area2 = new Area(12);
Area area3 = new Area(5.5,8.5);
}
}