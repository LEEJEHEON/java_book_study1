package chapter_1_3;

public class StringOperation3 {
	public static void main(String args[]) {
		String coffee1 = new String("Americano");
		String coffee2 = new String("Americano");
		String coffee3 = new String("AmeRicAnO");
		String coffee4 = new String("Blue mountin");
		String coffee5 = new String("Cappuccino");
		
		System.out.println((coffee1 ==coffee2) ? "equal" : "not equal");
		System.out.println((coffee1.equals(coffee2)) ? "equal" : "not equal");
		System.out.println((coffee1.equals(coffee3)) ? "equal" : "not equal");
		System.out.println((coffee1.equalsIgnoreCase(coffee3)) ? "equal" : "not equal");
		// equalsIgnoreCase : ��ҹ��� ���� ���� ������ Ȯ�� 
		
		System.out.println(coffee4.compareTo(coffee3));
		System.out.println(coffee4.compareTo(coffee5));
		System.out.println(coffee5.endsWith("A"));
		System.out.println(coffee5.endsWith("no"));
		// coffee5�� no�� ������ true
		
		
	}
	
}
