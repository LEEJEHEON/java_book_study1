package chapter_1_3;

public class bitNotOperation {
	public static void main(String args[]) {
		int i = 10;
		System.out.println("Variable i (Decimal) : " + i);
		System.out.println("Variable i (Binary) : " + Integer.toBinaryString(i));
		// toBinaryString 매개변수를 2진수로 표기하는 메소드
		// 8진수 : Integer.toHexString();
		// 16진수 : Integer.toOctalString();
		
		i = ~i;
		// 비트 연산자 not
		
		System.out.println("Variable i (Decimal) : " + i);
		System.out.println("Variable i (Binary) : " + Integer.toBinaryString(i));
		// int는 32비트라서 0이 다 1로 변함 
		// 11111111111111111111111111110101 = -11
	}
}
