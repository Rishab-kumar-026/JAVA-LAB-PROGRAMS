import java.util.*;
import java.lang.String;
class main{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        //If-else
        System.out.println("Enter a number here ");
        int num = obj.nextInt();

        if(num%2 == 0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }

        //If-else-if ladder
        System.out.println("Enter one more here ");
        int num2 = obj.nextInt();

        if(num2>0){
            System.out.println("The number is positive");
        }else if(num2<0){
            System.out.println("The number is negative");
        }else{
            System.out.println("The number is zero");
        }




    }

}