import java.util.Scanner;
 
class Main
{
 public static void main ( String [] args )
 {
  Scanner scan = new Scanner( System.in );
   
  System.out.println("Enter your name: ");
  String name = scan.nextLine();
   
  name = name.trim();
   
  int space = name.indexOf(" ");
  int len   = name.length();
   
  String first = name.substring(0, space);
  String last = name.substring(space);
   
  System.out.println();
   
  System.out.println(first + last.toUpperCase());
   
 }
}