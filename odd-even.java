import java.util.Scanner;
public class Odd_Even 
{
    public static void main(String[] args) 
    {
        int N;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number you want to check:");
        N = s.nextInt();
        if(N % 2 == 0)
        {
            System.out.println("The given number "+N+" is Even ");
        }
        else
        {
            System.out.println("The given number "+N+" is Odd ");
	}
    }
}
