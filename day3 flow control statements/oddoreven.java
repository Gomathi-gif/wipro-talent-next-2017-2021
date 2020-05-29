import java.util.Scanner;

public class Main{
 
   public static void main(String args[]){
  
      int a;
  
      System.out.println("Enter the number:");
     
   Scanner sc=new Scanner(System.in);
   
     a=sc.nextInt();
   
     if(a%2==0)
   
     {
      
    System.out.println("it is even");  
 
       }
    
    else 
      
  {
         
   System.out.println("it is odd");
 
       }
 
   }
}