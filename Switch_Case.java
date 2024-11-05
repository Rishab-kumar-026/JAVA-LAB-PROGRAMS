import java.util.Scanner;
import java.lang.String;
class main{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number between 0-5 : ");
        int number = obj.nextInt();

        switch(number){
            case 0:
                System.out.println("The number is 0");
                break;
            case 1:
                System.out.println("The number is 1");
                break;
            case 2:
                System.out.println("The number is 2");
                break;    
            case 3:
                System.out.println("The number is 3");
                break;
            case 4:
                System.out.println("The number is 4");
                break;
            case 5:
                System.out.println("The number is 5");
                break;
            default:
                System.out.println("The number is neither Greater than 5 or less than 0");
                break;
        }
}
}