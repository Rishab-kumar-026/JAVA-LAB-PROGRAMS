import java.util.Scanner;
class Employee
{
void display(String name , int age , String depart)
{
System.out.println(name + " of age " + age + " Joined today at " + depart + " Department");
}
}

class Main{
public static void main(String[] args)
{
Employee emp = new Employee();
Scanner obj = new Scanner(System.in);
System.out.println("Enter employee name: ");
String name = obj.nextLine();
System.out.println("Enter employee department: ");
String depart = obj.nextLine();
System.out.println("Enter employee age: ");
int age = obj.nextInt();


emp.display(name,age,depart);
}
}