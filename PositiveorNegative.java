import java.util.Scanner;

public class PositiveOrNegative {
   public static void main(String args[]){
      int N;
      System.out.println("Enter a number ::");
      Scanner sc = new Scanner(System.in);
      N= sc.nextInt();

      if (N> 0){
         System.out.println("Given number is a positive integer");
      } else if(N < 0){
         System.out.println("Given number is a negative integer");
      } else {
         System.out.println("Given number is zero);
      }
   }
}