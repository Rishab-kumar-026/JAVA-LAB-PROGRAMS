import java.util.Scanner;
import java.lang.String;
class M{
public static void main (String [] args)
{

Scanner obj = new Scanner (System.in);

System.out.println("Enter the Student name here: ");
String name = obj.nextLine();


System.out.println("Enter the College name here: ");
String college = obj.nextLine();

System.out.println("Hello Iam " + name + " from " + college + " College.");

}
}