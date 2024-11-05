import java.util.Scanner;
class StudentDetails
{
String name;
int roll_num;
String course;
Scanner obj = new Scanner(System.in);
void getDetails()
{

System.out.println("Enter your name here: ");
name = obj.nextLine();
System.out.println("Enter your Course here: ");
course = obj.nextLine();
System.out.println("Enter your roll number  here: ");
roll_num = obj.nextInt();


}

void displayDetails(){
System.out.println("Hello Iam " + name + " from " + course + ". My roll number is " + roll_num );
}
}

class Main{
public static void main(String[] args){
StudentDetails s1 = new StudentDetails();
s1.getDetails();
s1.displayDetails();

}
}