import java.lang.Math;

public class Calculator{
   
 static double powerInt(int n1, int n2){
  
  return Math.pow(n1,n2);
 
   }
   
 static double powerDouble(double n1, double n2){
  
  return Math.pow(n1,n2);
   
 }
   
 public static void main(String[] args){
 
       System.out.println(Calculator.powerInt(4,3));
  
      System.out.println(Calculator.powerDouble(4.0,4.0));
 
   }
    
    
}