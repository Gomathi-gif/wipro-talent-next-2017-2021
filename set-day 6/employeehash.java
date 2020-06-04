 import java.util.Iterator;
  import java.util.HashSet;
  
public class Main{
     
 public Static void main(String[] args){
      
    HashSet<String> set=new HashSet<>();
 
         set.add("sita");
      
    set.add("Rita");
   
       set.add("Gita");
      
    set.add("Remo");
     
     Iterator<String> it = set.iterator();
   
       while (it.hasNext()){
  
           System.out.println(it.next());
 
     } 
  }