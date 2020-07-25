package simpleArray;

public class StrToCideAndCodeToStr {

	public static void convert(String name) {
		System.out.println("Here is Entered: " + name);
		System.out.print("Here is codepoins of : ");
		for (int i = 0; i < name.length(); i++) {
			System.out.print(name.codePointAt(i));
		}
		System.out.println();
	}

	public static void convert(int num) {
		System.out.println("Here is Entered: " + num);
		System.out.print("Here is string of : " + ((char) num));
	}

	public static void main(String[] args) {

		convert("Amrendra Kumar Gupta");
		convert(97);

	}

}
