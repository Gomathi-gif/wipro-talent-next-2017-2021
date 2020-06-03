import java.util.Scanner;

public class Main {

	 public static void main(String[] args) {
		 
		 Scanner input = new Scanner(System.in);
		System.out.print("Number: ");
			int number = input.nextInt();
			input.close();
			int odd_digits_sum = 0;
			while (number > 0) {
			    int digit = number % 10;
			    if (digit % 2 != 0) {
				odd_digits_sum += digit;
			    }
			    number /= 10;
			}
			System.out.printf("Sum of %s's odd digits: %f", number, odd_digits_sum
			
			
			
		    }
	
	
}
}
