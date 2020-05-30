shape c=new Circle();

shape t=new Triangle();

shape s=new Square();

Class Shape{
  
  void draw(){
   
     System.out.println("drawing");
   
 }
   
 void erase(){
 
       System.out.println("Erasing");
 
   }
    
}

class Circle extends Shape{
  
  void draw(){
    
    System.out.println("Drawing Circle");
  
  }
  
  void erase(){
  
      System.out.println("Erasing circle");
 
   }
}

class Triangle extends Shape{

    void draw(){
  
      System.out.println("Drawing triangle");

    }
  
  void erase(){
  
      System.out.println("Erasing triangle");
  
  }
}

class Square extends Shape{
 
   void draw(){
   
     System.out.println("Drawing square");

    }
    
void erase(){
   
     System.out.println("Erasing square");
  
  }
}

public class Polymorphism{

    public static void main(String[] args){
   
     shape c=new Circle();
    
    shape t=new Triangle();
      
   shape s=new Square();
   
      c.draw();
     
    c.erase();
   
       t.draw();
  
       t.erase();
  
       s.draw();
         
s.erase();
 
   }
}