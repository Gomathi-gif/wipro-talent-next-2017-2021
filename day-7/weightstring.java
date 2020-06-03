import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public Main {
        public static boolean weight_matches(int x,int sum_weight){
              if(x==sum_weight){
                  // System.out.println("Matches:"+x+" "+sum_weight);
                   return true;
             }else return false;
        }
 
        public static boolean chkstr(String s,int n){
            if(s.length()>=1 && s.length()<=Math.pow(10,5) && n>=1 && n<= Math.pow(10,5)){
              return true;
            }else return false;
        }

        public static void main(String[] args) {
             Scanner in = new Scanner(System.in);
             boolean moveon=false;
             String s="";
             int n =0;
             try{
                s = in.next(); 
                n = in.nextInt();
                if(chkstr(s,n)){
                     moveon=true;
                 }
             }catch(Exception execp){
                 moveon=false;
             }
 
             String final_Status="";
 
             for(int a0 = 0; a0 < n && moveon; a0++){
                 int x = in.nextInt();
                 char[] s_array=s.toCharArray();
                 int sum_weight=0;
                 char char_holder=s_array[0];
                 for(int i=0;i<s_array.length;i++){
 
                     if(s_array[i]==char_holder){
                         sum_weight=sum_weight+((int)char_holder-96);
                       //System.out.println(sum_weight);
                     }else if(s_array[i]!=char_holder){
                             char_holder=s_array[i];
                             sum_weight=0;
                             sum_weight=sum_weight+((int)char_holder-96);
                     }
 
                    if(weight_matches(x,sum_weight)){
                          final_Status="Yes";
                          break;
                     }else final_Status="No";
                 }
                 System.out.println(final_Status);

              }
     }
}