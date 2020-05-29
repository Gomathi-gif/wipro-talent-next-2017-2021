public class Main{

public static void main (String[] args) {
  
 String g=args[0];
  
  System.out.println(g);
  
  int a=Integer.parseInt(args[1]);
   
 System.out.println(a);
  
  double i=0;
  
  if(g.equals("Female")&& a<=58&& a>=1)
 
   {
  
      i=8.2;
  
  }
  
  else if(g.equals("Female")&& a<=120 &&a>=5)
  
  {
    
    i=7.6;

    }
  
  else if(g.equals("Male")&& a<=60 &&a>=1)

    {
     
  i=9.2; 
  
  }
  
  else if(g.equals("Female")&& a<=120 &&a>=1)

    {
   
     i=8.3;
  
  }
    
System.out.println("Interest="+i+"%");

}
}