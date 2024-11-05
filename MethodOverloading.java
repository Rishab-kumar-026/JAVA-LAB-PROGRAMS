import java.util.Scanner;
class Areas{
int length;
int breadth;
int side;
double radius;

void Area(int length , int breadth){
System.out.println("Area of Rectangle : " + (length*breadth)); 
}
void Area(int side){
System.out.println("Area of Square : " + (side*side)); 
}
void Area(double radius){
System.out.println("Area of Circle : " + (3.14*radius*radius)); 
}

}

class main
{
public static void main(String[] args){
Areas area = new Areas();
area.Area(5,10);
area.Area(15);
area.Area(12.5);


}
}