public class print0to100{
   public static void main(String args[]) {
	int n = 100;
	System.out.print("Even Numbers from 1 to "+n+" are: ");
	for (int i = 0; i <= n; i++) {
	   if (i % 2 == 0) {
		System.out.print(i + " ");
	   }
	}
   }
}