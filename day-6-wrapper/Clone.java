public class Main{
 
   public static void  main(String[] args) throws CloneNotSupportedExcepton{
   
     Employee e= new Employee("peter");
   
     Employee eClone = e.clone();
    
    eClone.setName("parker");
  
      System.out.println(e.getName());
 
       System.out.println(eClone.getName());
  
  }
}

class Employee implements Cloneable{
   
 private String n;
 
   public Employee(String name){
     
   this.n = name;
 
   }
 
   public String getName(String name){
     
   this.n=name;
 
   }
   
 public Employee clone() throws CloneNotSupportException{
  
      return (Employee) super.clone();
   
 }
}