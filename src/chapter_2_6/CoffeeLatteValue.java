package chapter_2_6;

public class CoffeeLatteValue extends CoffeeValue{
	protected int capacityMilk;
	
	public CoffeeLatteValue(String coffeeName, int capacity, int capacityMilk)
	{
		super(coffeeName, capacity); // 부모클래스의 생성자
		this.capacityMilk = capacityMilk; // 현재 클래스의 변수
	}
	
	public String getInfo() {
		return "Milk Capacity : " + (this.capacityMilk) + "ml";
	}
	
	public String getDescription() {
		String rt = super.getInfo(); // 부모클래스의 getInfo
		rt += "\n";
		rt += this.getInfo(); //오버라이드한 getInfo
		
		return rt;
	}
	
	public static void main(String args[]) {
		CoffeeLatteValue order1 = new CoffeeLatteValue("Cafe Latte", 500,100);
		System.out.println(order1.getDescription());
		
	}
}
