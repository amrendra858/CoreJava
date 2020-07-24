package simpleArray;

import java.util.Arrays;
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

	// Start method of deleting item
	public int[] removeItem() {
		System.out.println("Please Enter item number to delete: ");
		int itemNumber;
		// Take item no from user.
		int listnum = scan.nextInt();
		System.out.println(array.length);
		if(listnum > array.length) {
			System.out.println("List is empty.");
			if(array.length == 0) {
				System.out.println("Do you want to create another list? press y for yes");
				char yn = scan.nextLine().toLowerCase().charAt(0);
				scan.nextLine();
				if(yn == 'y') {
					setArrayValues();
				}
//				else {
//					System.exit(0);
//				}
			}
			else {
				System.exit(0);
			}
			itemNumber = (listnum - 1);
		}
		else if (listnum > array.length) {
			System.out.println("You enterd outof range item, Do you want to see list? press y for yes");
			if(scan.nextLine().toLowerCase().charAt(0) == 'y') {
				printArray();
			}
			else {
				System.exit(0);
			}
			itemNumber = (listnum - 1);
		}
		else {
			// Convert user input to index value for correct position of item
			itemNumber = (listnum - 1);
		}


		// If user will enter incorrect value then prompt should be on console
		scan.nextLine();

		// Assign new array with (-1) length from old array length
		int[] newarray = new int[(array.length) - 1];

		// Checking if user entering the list number is in the range then go for further process.
		if (itemNumber < array.length) {
			// Show to user that entered item removed from list.
			System.out.println("Deleted " + listnum + " th item: " + array[itemNumber]);

			// Assigning the value which are before the entered index in new array
			for (int i = 0; i < itemNumber; i++) {
				newarray[i] = array[i];
			}

			// Assigning the value which are after the entered index in new array it means we not take value of entered index. see line 92: int itemNumber = (listnum-1);
			for (int i = itemNumber; i < newarray.length; i++) {
				newarray[i] = array[i + 1];
			}
		}
		// If user Eentered wrong list no then show the message for item not present in list.
		else {
			System.out.println("Entered item not present in itemList.");
		}
		// Assigning newarray in old array because further process array should be updated.
		array = newarray;
		// Then return the updated array to the method.
		return array;
	}

	// End method of deleting item

//End of class
}

public class ArrayIncrement {
	static Scanner scan = new Scanner(System.in);
	public static void userchoice() {
		System.out.println("\nEnter your choice below: ");
		System.out.println("\tEnter 1 for print list: ");
		System.out.println("\tEnter 2 for search value in list: ");
		System.out.println("\tEnter 3 for Delete item: ");
		System.out.println("\tEnter 0 for quit: ");
	}

	public static void main(String[] args) {

		boolean flag;

		ArrayEnter a1 = new ArrayEnter();

		a1.setArraysize();
		a1.setArrayValues();

		while (flag = true) {
			userchoice();
			int choice = scan.nextInt();
			scan.nextLine();
			switch (choice) {
			case 1:
				a1.printArray();
				break;
			case 2:
				a1.searchItem();
				break;
			case 3:
				System.out.println("Updated list is: " + Arrays.toString(a1.removeItem()));
				break;
			case 0:
				System.exit(0);
			default:
				System.out.println("Not Valid Entry.");
			}
		}

	}

}
