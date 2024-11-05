import java.lang.String;
import java.util.Scanner;
class main{
public static void main(String[] args){
try{
Scanner obj = new Scanner(System.in);
System.out.println("Enter the two numbers here " );
int num1 = obj.nextInt();
int num2 = obj.nextInt();

int result = product(num1,num2);
System.out.println("The Final result " + result);
}
catch(ArithmeticException e){
System.out.println("Error had occured" );
}
System.out.println("Program continues further....");
}

public static int product(int x,int y) throws ArithmeticException{
return x/y;
}
}