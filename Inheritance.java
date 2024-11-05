import java.util.Scanner;
import java.lang.String;
class student{
void student_details(String name , String course){

System.out.println("Hello Iam " + name + " from " + course + " course.");

}
}

class employee extends student{

void display(String name){
System.out.println( name + "Is working today " );
}

}

class main{
public static void main(String[] args){
employee emp = new employee();

emp.student_details("Rishab","BCA");
emp.display("Tommy ");
}
}
