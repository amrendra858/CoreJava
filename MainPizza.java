class BasePizza {
	
	private double pizzaSize;
	private double basePrice;
	
	public BasePizza(double pizzaSize, double basePrice){
		this.basePrice = basePrice;
		this.pizzaSize = pizzaSize;
	}
	
	public BasePizza(){
		this.basePrice = 200;
		this.pizzaSize = 7;
	}

	public double getSize() {
		return pizzaSize;
	}
	
	public double getPrice() {
		return basePrice;
	}

}

class NonVegPizza extends BasePizza {
	
	private String meat;
	private double meatPrice;
    
    //Problem mendatory to create constructor for baseclass with same paramaters 
	public NonVegPizza(double pizzaSize, double basePrice) {
		super(pizzaSize, basePrice);
	}
	
    //Problem mendatory to create constructor for baseclass with same paramaters 

	public NonVegPizza() {
	}

	public String getMeat() {
		return meat;
	}

	public void addMeatWithPrice(String meat, double meatPrice) {
		this.meatPrice = meatPrice;
		this.meat = meat;
	}

	public double getMeatPrice() {
		return meatPrice;
	}
	
	public double getPizzaPrice() {
		return meatPrice + getPrice();
	}
	
	
}


public class MainPizza {

	public static void main(String[] args) {

		System.out.println("---------------Basic Without argument passing in constructor-------------");
		BasePizza basic = new BasePizza();
		System.out.println("Base Price of "+ basic.getSize() +" Pizza: "+basic.getPrice());
		System.out.println("Your "+ basic.getSize() +" inch Pizza is @price: "+basic.getPrice());
		
		System.out.println("\n--------------Basic 1 With argument passing in constructor--------------");
		BasePizza basic1 = new BasePizza(8, 250);
		System.out.println("Base Price of "+ basic1.getSize() +" Pizza: "+basic1.getPrice());
		System.out.println("Your "+ basic1.getSize() +" inch Pizza is @price: "+basic1.getPrice());

		System.out.println("\n--------------Non Veg 1 With argument passing in constructor------------");
		NonVegPizza np = new NonVegPizza(9, 300);
		System.out.println("Base Price of "+ np.getSize() +" Pizza: "+np.getPrice());
		np.addMeatWithPrice("Mutton", 450);
		System.out.println("Additional Meat Type: "+np.getMeat()+ " with Additional : "+ np.getMeatPrice());
		System.out.println("Your "+ np.getSize() +" inch Pizza with " + np.getMeat() + " meat ready at price: "+np.getPizzaPrice());

		System.out.println("\n---------------Non Veg 2 Without argument passing in constructor--------");
		NonVegPizza np2 = new NonVegPizza();
		System.out.println("Base Price of "+ np2.getSize() +" Pizza: "+np2.getPrice());
		np2.addMeatWithPrice("Mutton", 450);
		System.out.println("Additional Meat Type: "+np2.getMeat()+ " with Additional : "+ np2.getMeatPrice());
		System.out.println("Your "+ np2.getSize() +" inch Pizza with " + np2.getMeat() + " meat ready at price: "+np2.getPizzaPrice());
	}

}
