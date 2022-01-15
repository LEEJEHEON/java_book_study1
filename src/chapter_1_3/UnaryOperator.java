package chapter_1_3;

public class UnaryOperator {
	public static void main(String [] args) {
		int vluAfter = 0;
		long vluBefore = 0;
		char chrAfter = 'A';
		
		System.out.println("First reference : " + vluAfter++);
		System.out.println("First reference : " + --vluBefore);
		
		System.out.println("First reference : " + chrAfter++);
		
		System.out.println("second reference : " + vluAfter);
		System.out.println("second reference : " + vluBefore);
		// 전위형이라서 값이 First reference랑 같음
		System.out.println("second reference : " + chrAfter);
		// 문자에 ++ 하면 다음 문자가 나옴 (결과값 : B)
	}
}
