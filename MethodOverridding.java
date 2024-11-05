import java.util.Scanner;
import java.lang.String;
class person
{
String name;
String cmp_name;
void get_details(){
Scanner obj = new Scanner (System.in);
System.out.println("Enter the name here: ");
name = obj.nextLine();

System.out.println("Enter the Company name here: ");
 cmp_name = obj.nextLine();
}

void display_details()
{
System.out.println("Hello , Myself " + name + " from " + cmp_name + " company ");
}

}

class Student extends person
{
String stu_name;
String course_name ;
Scanner obj = new Scanner (System.in);
void get_details(){
System.out.println("Enter the student name here: ");
 stu_name = obj.nextLine();

System.out.println("Enter the course name here: ");
 course_name = obj.nextLine();
}

void display_details()
{
System.out.println("Hello , Myself " + stu_name + " from " + course_name + " course ");
}

}

class main
{
public static void main(String[] args){

person obj2 = new Student();

obj2.get_details();
obj2.display_details();
}
}