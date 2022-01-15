package chapter_1_3;

public class StringOperation6 {
	public static void main(String args[]) {
		System.out.println("돈과 관련된 유용한 format");
		System.out.println(String.format("%,d" , 1000000));
		System.out.println(String.format("%,.2f" , 1000000F));
		
		System.out.println("\n 문자열 자릿수 맞추는데 유용한 format");
		System.out.println(String.format("%10s" , "abcde"));
		System.out.println(String.format("%10s" , "abcdefghujklmnopqr"));
		// 긴것의 가운데 맞춰짐
		
		System.out.println("\n부동 소수점에 대한 유용한 format");
		System.out.println(String.format("%.2f" , 12345.121245)); // 12345.12
		System.out.println(String.format("%.2f" , 12.1)); // 12345.10
		
		
	}
}
