package objectOriented;

public class AutomaticPromotionOfStringObjectAndNull {
	
	public void method(String s) {
		System.out.println("String method called: "+ s);
	}

	public void method(Object o) {
		System.out.println("Object method called: "+ o);
	}

	public static void main(String[] args) {
		
		AutomaticPromotionOfStringObjectAndNull a = new  AutomaticPromotionOfStringObjectAndNull();
		
		a.method("Hi"); //This argument is String type so its going for the String method.
		
		a.method(new Object()); //This argument is Object type so its going for the Object method.
		
		a.method(null);  //This null is String and Object both type, so its going for the String method because object is parent of String and it will take preference for nearest one.
		
		a.method((String) null); // we type cast the null as String then it will go for string method.
		
		a.method((Object) null); // we type cast the null as Object then it will go for Object method.


	}

}
