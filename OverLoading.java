package Overloading;

class BaseClass {
	
	public static void display() {
		System.out.println("Display from BaseClass.");
	}
}

public class OverLoading extends BaseClass {

	public static void display() {
		System.out.println("Display from OverLoading.");
	}

	public static void main(String[] args) {

		OverLoading o = new OverLoading();
		BaseClass o1 = new OverLoading();
		
		System.out.println("\nVia ClassName.MemberName");
		
		//Via Object we are able to access static members?
		o.display();
		o1.display();
		
		System.out.println("\nVia ClassName.MemberName");

		//Via ClassName.member we should access the static members.
		OverLoading.display();
		BaseClass.display();
	}
}
