package chapter_1_3;

public class StringOperation5 {
	public static void main(String args[]) {
		int i = 3;
		
		System.out.println(i);
		System.out.println(String.format("%04d", i));
		// % 인자번호
		// 04 너비
		// d 유형
		// 유형 = {10진수 : d , 부동 소수점 : f, 16진수 : x , 문자 c , 문자열 s}
	}
}
