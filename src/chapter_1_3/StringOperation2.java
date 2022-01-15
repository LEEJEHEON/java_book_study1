package chapter_1_3;

public class StringOperation2 {
	public static void main(String []args) {
		String coffee1 = "Americano";
		String coffee2 = "Americano";
		System.out.println("coffee1 and coffee2 : " + ((coffee1 == coffee2) ? "same" : "not same"));
		
		String coffee3 = new String("Americano");
		String coffee4 = new String("Americano");
		System.out.println("coffee3 and coffee4 : " + ((coffee3 == coffee4) ? "same" : "not same"));
		// 3, 4 는 new를 이용하여 데이터를 생성하여 not same
		
		System.out.println(coffee1 + "," + System.identityHashCode(coffee1));
		System.out.println(coffee2 + "," + System.identityHashCode(coffee2));
		System.out.println(coffee3 + "," + System.identityHashCode(coffee3));
		System.out.println(coffee4 + "," + System.identityHashCode(coffee4));
		
		
	}
}
