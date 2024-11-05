import java.util.Scanner;
class main{
public static void main(String[] args){

Scanner obj = new Scanner (System.in);
System.out.println("Multi-Dimensional Array");

System.out.println("Enter the number of Rows: ");
int rows = obj.nextInt();

System.out.println("Enter the number of Columns: ");
int cols = obj.nextInt();

int[][] arr = new int[rows][cols];

System.out.println("Enter the elements into the 2D Array: ");

for(int i=0;i<rows;i++){
for(int j=0;j<cols;j++){
arr[i][j] = obj.nextInt();
}
}

System.out.println("2D Array: ");

for(int i=0;i<rows;i++){
for(int j=0;j<cols;j++){
System.out.print(arr[i][j] + " ");
}
System.out.println(" ");
}
}

}