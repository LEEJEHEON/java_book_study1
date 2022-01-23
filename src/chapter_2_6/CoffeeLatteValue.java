package chapter_2_6;

public class CoffeeLatteValue extends CoffeeValue{
	protected int capacityMilk;
	
	public CoffeeLatteValue(String coffeeName, int capacity, int capacityMilk)
	{
		super(coffeeName, capacity); // �θ�Ŭ������ ������
		this.capacityMilk = capacityMilk; // ���� Ŭ������ ����
	}
	
	public String getInfo() {
		return "Milk Capacity : " + (this.capacityMilk) + "ml";
	}
	
	public String getDescription() {
		String rt = super.getInfo(); // �θ�Ŭ������ getInfo
		rt += "\n";
		rt += this.getInfo(); //�������̵��� getInfo
		
		return rt;
	}
	
	public static void main(String args[]) {
		CoffeeLatteValue order1 = new CoffeeLatteValue("Cafe Latte", 500,100);
		System.out.println(order1.getDescription());
		
	}
}
