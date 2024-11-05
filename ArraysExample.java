import java.util.Scanner;
class main
{
public static void main(String[] args){
Scanner obj = new Scanner(System.in);

System.out.println("Enter the size of the array: ");
int num = obj.nextInt();

int[] arr = new int[num];
System.out.println("Enter the elements into the array: ");
for(int i=0;i<num;i++){
arr[i] = obj.nextInt();
}

System.out.println("Entered array elements are: ");
for(int i=0;i<num;i++){
System.out.print(arr[i] + " " );
}

}
}