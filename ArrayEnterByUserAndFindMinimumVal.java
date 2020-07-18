package simpleArray;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEnterByUserAndFindMinimumVal {
	
	public static Scanner scan = new Scanner(System.in);
	
	static int[] initialArray; //Declare a array without size

	//Method to make user input array and return for further process.
	public static int[] readIntegers(int size) {
		System.out.println("You have successfully create a Array of size: "+size);

		initialArray = new int[size]; // Initialize an array size by asking from user
		for (int i = 0; i < size; i++) {
			System.out.println("Please Enter " +(i)+" element :");
			initialArray[i] = scan.nextInt(); //Assigning values in array from user input
		}
		return initialArray;
	};
	
	public static int findMin() {
		int minVal = initialArray[0]; //Always keep first element of the array for comparing next values for minimum and maximum
		for(int i = 0; i < initialArray.length; i++) {
			if (initialArray[i] < minVal) {
				minVal = initialArray[i];
			}
		}
		return minVal;
	}
	
	public static int findMax() {
		int maxVal = initialArray[0]; //Always keep first element of the array for comparing next values for minimum and maximum
		for(int i = 0; i < initialArray.length; i++) {
			if (initialArray[i] > maxVal) {
				maxVal = initialArray[i];
			}
		}
		return maxVal;
	}

	public static void main(String[] args) {
		int size;
		System.out.println("Enter how many elemets you need in array: ");
		readIntegers(scan.nextInt()); //Set Size of array and creation

		System.out.println("Entered Array is: "+Arrays.toString(initialArray));
		System.out.println("Minimum element of Array is: "+findMin());
		System.out.println("Maximum element of Array is: "+findMax());
	}

}
