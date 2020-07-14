package simpleArray;

import java.util.*;

public class calculatorEndUser {

	public static void main(String[] args) { 
		
		Scanner scan = new Scanner(System.in);
		int loop = 1;
		int number;

		while (loop <= 5){

			System.out.println("Enter "+loop+" attempt no above: 10, 20, 30"); 
			
			number = scan.nextInt();
			
			if (number == 10) { 
				System.out.println("After 10 years you become rich."); 
			} 
			else if (number == 20) {
				System.out.println("After 20 years you become police.");
			} 
			else if (number == 30) {
				System.out.println("After 30 years you become Doctor."); 
			}
			else {
				System.out.println("Please Enter a valid no.");
			}
			
			loop++;
			
			if(loop > 5) {
				System.out.println("You have tried maximum, please try again.");
				System.out.println("Do you want try again? Press Y for yes N for No.");
				char retry = scan.next().toLowerCase().charAt(0);
				if (retry == 'y') {
					loop = 1;
				}
				else {
					break;
				}
			}
		}
	}
}
