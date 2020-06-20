public class AutomaticPromotionOverloading {

	public void display(short num) {
		System.out.println("Short method running "+ num);
	}

	public void display(int num) {
		System.out.println("Int method running "+ num);
	}

	public void display(long num) {
		System.out.println("Long method running "+ num);
	}
	
	public void display(float num) {
		System.out.println("Float method running "+ num);
	}


	public static void main(String[] args) {
		AutomaticPromotionOverloading a = new AutomaticPromotionOverloading();
		a.display((short)5);
		a.display(10);
		a.display((float)10.5); //a.display(10.5f);
		a.display(10);
    //char type automatic promote upto double to find compartable method in case of method overloading.
		a.display('A');

	}

}
