class Patient
{
  
  String name;
  
  double w,h;
 
   Patient(double weight,double height)

    {
        w=weight;
   
     h=height;
      
  
    }
  
  double bmi()
   
 {
        
double b= (w/(h*h))*703;
      
  return b;
   
 }
}

public class Patients{


     public static void main(String[] args){
   
      Patient p=new Patient(25,32);
     
    System.out.println(" BMI of patient"+p.bmi());
  
   }
}