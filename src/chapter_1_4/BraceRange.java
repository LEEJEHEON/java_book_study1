package chapter_1_4;

public class BraceRange {
	public static void main(String args[]) {
		float price1 = 2.99F;
		System.out.println("price1 variable : "+ price1);
		
		// if 구문 영역
		if (args != null && args.length > 0 ) {
			float price2 = 3.99F;
			price1 += price2;
			System.out.println("price1 variable : " + price1);
			System.out.println("price2 variable : " + price2);	
		}
		// if문 안에서 선언된 price2는 if구문 영역을 벗어나면 사용할 수 없다.
		
		
	}
}
