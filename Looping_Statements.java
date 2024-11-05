import java.util.Scanner;
import java.lang.String;
class main{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any 3 number here :");
        int num1 = obj.nextInt();
        int num2 = obj.nextInt();
        int num3 = obj.nextInt();

        //For loop
        for(int i = 0; i < num1; i++){
            System.out.print((i+1) + " ");
        }
         System.out.println(" ");

        //While loop
        while(num2 < 10){
            System.out.print((num2 * 2) + " ");
            num2++;
        }
        System.out.println(" ");

        //Do-while loop
        do{
            System.out.print(num3 + " ");
            num3++;
        }while(num3 < 20);
        System.out.println(" ");
        
}
}