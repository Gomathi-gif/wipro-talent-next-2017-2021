import java.util.Scanner;

class Fruit{
  
  private String name;
  
  private String taste;
  
  private int size;
  
  Scanner s = new Scanner(System.in);
 
   public void eat(){
    
    name=s.next();
    
    System.out.prinln("Name of fruit is "+name);
  
      taste = s.next();
  
      System.out.println("Taste is "+taste);
 
   }
}

class Apple extends Fruit{
  
  public void eat(){
    
    System.out.prinln("Name of fruit is apple");
    
    System.out.prinln("taste is sweet");
 
   System.out.println("it is heart in shape"); 
      
    }
}

class Orange extends Fruit{
   
 public void eat(){
  
      System.out.prinln("Name of fruit is orange");
   
     System.out.prinln("taste is sour");
 
    System.out.println("it is round ");       

    }
}

public class Fruits{
 
   public static void main(String[] args){
 
       Apple a=new Apple();
  
      a.eat();
    
    Orange o=new Orange();

        o.eat;
      
  
    }
}
    