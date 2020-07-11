package simpleArray;

class RawArray {
	
	int[] array = { 2,5,3,4,8,7,9,9 };
	
	public void sortedDesc ()	{

		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j<array.length; j++) {
				if(array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		for(int i = 0; i<array.length; i++) {
			System.out.println(array[i]);
		}

	}

	public void sortedAssc ()	{

		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j<array.length; j++) {
				if(array[i] < array[j]) {
					int temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}

		for(int i = 0; i<array.length; i++) {
			System.out.println(array[i]);
		}

	}
	
	
}


public class ArraySorting {

	public static void main(String[] args) {
		
		RawArray rw = new RawArray();
		
		rw.sortedAssc();
		System.out.println("----------------");
		rw.sortedDesc();

	}

}
