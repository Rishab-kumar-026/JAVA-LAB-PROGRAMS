import java.util.Scanner;
import java.lang.String;
abstract class Shape{  //abstract class
abstract double area();  //abstract method
}
class Circle extends Shape{
double radius;

public Circle(double radius){
this.radius = radius;
}

double area(){
return Math.PI*radius*radius;
}

}

class main{
public static void main(String[] args){
Scanner obj = new Scanner(System.in);

System.out.println("Enter the radius of the circle: ");
double radius = obj.nextDouble();

Circle cr = new Circle(radius);

System.out.println("The area of the circle with radius  " + radius + " is : " + cr.area()); 
}
}