import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    int N, c, f = 1;

    System.out.println("Enter an integer to calculate its factorial");
    Scanner in = new Scanner(System.in);

    N = in.nextInt();

    if (N < 0)
      System.out.println("Number should be non-negative.");
    else
    {
      for (c = 1; c <= N; c++)
        f = f*c;

      System.out.println("Factorial of "+N+" is = "+f);
    }
  }
}