import java.util.Iterator;
 
 import java.util.TreeSet;
 
 public class Main{
   
   public Static void main(String[] args){
  
        TreeSet<String> set=new TreeSet<>();
    
      set.add("sita");
    
      set.add("Rita");
  
        set.add("Gita");
    
      set.add("Remo");
      
    Iterator<String> it = set.iterator();
  
        String query = "Gita";
    
      boolean result = false;
    
      while (it.hasNext()){
           
   if(it.next().equals(query)){
          
        result = true;
              
    break;
           
   }
      } 
 
     if
      {
  
        (result System.out.println(query + "exists");
  
    }
    
  else 
      {
       
   System.out.println(query +"doesn't exist";)
  
    }
 
 }
  }