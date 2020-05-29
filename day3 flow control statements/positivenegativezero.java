import java.util.Scanner;

public class Main{
 
   public static void main(String args[]){
   
     int a;
       
 System.out.println("Enter the number:");
   
     Scanner sc=new Scanner(System.in);
     
   a=sc.nextInt();
        
if(a>0)
    
    {
       
   System.out.println("it is positive");  
 
       }
    
    else if(a<0)
   
     {
        
    System.out.println("it is negative");
  
      }
     
   else
  
      {
       
     System.out.println("it is zero");
  
      }
   
 }
}