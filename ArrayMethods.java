package simpleArray;

import java.util.Scanner;

class Array {

	Scanner sn = new Scanner(System.in);
	
	private int[] array;
	
	public void setArray() {
		System.out.println("Enter Array size: ");
		if(sn.hasNextInt()) {
			int size = sn.nextInt();
			array = new int[size];
			System.out.println("You have created an Array of size "+ array.length);
			assignArrayVal();
		}
		else {
			System.out.println("Wrong value Entered, Please enter Correct integer value as a size of an Array.");
			sn.nextLine();
			setArray();
		}
	}
	
	public void assignArrayVal() {
		for (int i=0; i<array.length; i++) {
			System.out.println("Enter array "+(i+1)+" value: ");
			array[i] = sn.nextInt();
		}
		printElements();
	}

	public void printElements() {
		for (int i=0; i<array.length; i++) {
			System.out.println("Value of Array "+(i+1)+" position is : "+array[i]);
		}
		System.out.println("----------\nArray size is: "+array.length);
		sumArray();
	}

	public void sumArray(){
		int sum = 0;
		for (int i = 0; i<array.length; i++) {
			//sum = sum + array[i];
			sum += array[i];
		}
		System.out.println("Sum of an Array Elements: "+sum);
		avgArray((double) sum);
	}

	public void avgArray(double sum){
		System.out.println("Average of an Array is :" +(sum/array.length));
	}

}

public class ArrayMethods {

	public static void main(String[] args) {
		Array a1 = new Array();
		a1.setArray();
	}

}
