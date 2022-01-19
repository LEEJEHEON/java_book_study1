package chapter_2_6;

public class CoffeeValue {
	protected int capacity;
	protected String coffeeName;
	
	public CoffeeValue(String name, int size) {
		capacity = size; 
		coffeeName = name;		
	}
	
	public String getInfo() {
		return "Capacity : " + capacity + "ml , " + "CoffeeName : " + coffeeName;
	}
	
	public static void main(String args[]) {
		CoffeeValue order1  = new CoffeeValue("Americano", 360);
		CoffeeValue order2  = new CoffeeValue("Cafe Latte", 500);
		CoffeeValue order3  = new CoffeeValue("Cafe Mocha", 200);
		
		System.out.println(System.identityHashCode(order1) + ", "+ order1.getInfo());
		System.out.println(System.identityHashCode(order2) + ", "+ order2.getInfo());
		System.out.println(System.identityHashCode(order3) + ", "+ order3.getInfo());
		
		
	}
}
