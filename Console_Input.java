import java.util.Scanner;
import java.lang.String;
class main{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = obj.nextLine();

        System.out.println("Hello " + name + " welcome to Java Programming");
    }
}