import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
    {
        int n, max,count=0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements in the array:");
        n = s.nextInt();
        int a[] = new int[25];
        System.out.println("Enter elements of array:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        max = a[0];
        for(int i = 0; i < n; i++)
        {
            if(max < a[i])
            {
                max = a[i];
            }
        }
        System.out.println("Maximum value:"+max);
        System.out.print("Enter the element of which you want to count number of occurrences:");
         max= s.nextInt();
        for(int i = 0; i < n; i++)
        {
            if(a[i] == max)
            {
                count++;
            }
        }
        System.out.println("Number of Occurrence of the Element:"+count);
    }
}