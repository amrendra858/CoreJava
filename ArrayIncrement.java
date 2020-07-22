package simpleArray;

import java.util.Scanner;

class ArrayEnter {
	Scanner scan = new Scanner(System.in);

	private int[] array;

	public void setArraysize() {

		System.out.println("Enter Array size: ");

		if (scan.hasNextInt()) {
			array = new int[scan.nextInt()];
		} else {
			System.out.println("Entered wrong size.");
			scan.nextLine();
			setArraysize();
		}
	}

	public void resizeArray(int size) {
		array = new int[size];
	}

	public void setArrayValues() {
		for (int i = 0; i < array.length; i++) {
			System.out.print("Enter " + (i + 1) + " element : ");
			if (scan.hasNextInt()) {
				array[i] = scan.nextInt();
			} else {
				System.out.println((i + 1) + "th value entered as wrong please enter correct integer value.");
				i--;
			}
			scan.nextLine();
		}
	}

	public void printArray() {
		
			System.out.print("Array elements are: [");
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i] + ((i < (array.length - 1)) ? ", " : ""));
			}
			System.out.println("]");
		}

	public void searchItem() {
		boolean isFound = false;
		int itemName;

		System.out.println("Enter integer value to search: ");
		
		if (!scan.hasNextInt()) {
			System.out.print("Wrong input " + scan.next() + ", ");
			searchItem();
			scan.nextLine();
			itemName = scan.nextInt();
		} else {
			itemName = scan.nextInt();
		}

		for (int i = 0; i < array.length; i++) {
			if (itemName == array[i]) {
				isFound = true;
			}
		}

		if (!isFound) {
			System.out.println("Searched item " + itemName + " not found in Array.");
		} else {
			System.out.print("Searched item " + itemName + " is found in Array on these positions: ");

			for (int i = 0; i < array.length; i++) {
				if (itemName == array[i]) {
					System.out.print((i + 1) + (i != (array.length - 1) ? ", " : ""));
				}
			}
		}
	}
}

public class ArrayIncrement {

	public static void main(String[] args) {

		ArrayEnter a1 = new ArrayEnter();

		
		
		a1.setArraysize();
		a1.setArrayValues();
		a1.printArray();
		a1.searchItem();

	}

}
