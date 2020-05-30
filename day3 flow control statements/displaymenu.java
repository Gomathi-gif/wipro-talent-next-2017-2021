import java.util.Scanner;

public class Main{
  
  public static void main(String[] args){
  
      Scanner s = new Scanner(System.in);
     
   do{
       
     System.out.println("1.Add");
    
         System.out.println("2.sub");
     
        System.out.println("Enter the option");
   
          int op = s.nextInt();
          
   int i = s.nextInt();
          
   int n= s.nextInt();
    
         switch(op){
            
     case 1:System.out.println(i+n);
     
                   break;
             
    case 2:System.out.println(i-n);
    
	break;
         }
        
     System.out.println("to continue enter y or Y");
         
    char yes = s.next.charAt(0);
       
      
             }while(yes=='y' || yes=='Y');
  
  }
}