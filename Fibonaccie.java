import java.util.Scanner;

public class Fibonaccie {
	public static void main(String args[]) {
		int first = 0;
		int second = 1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how many entries of fibonacci you want: ");
		
		int entries = sc.nextInt();

		System.out.print(first +", " + second +", ");

		for(int i = 0; i <= entries; i++) {

			int sum = first + second; // take sum of both values
			first = second; // Swap the second values in first
			second = sum; // Assign sum in second

			System.out.print(second + ((i < entries) ? ", " : ""));

		}
	}
}
