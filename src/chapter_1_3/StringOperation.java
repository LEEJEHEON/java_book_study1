package chapter_1_3;

public class StringOperation {
	public static void main(String args[]) {
		String target = "Welcome to java world";
		
		System.out.println(target.concat(" and Gilbut press"));
		// 문자 붙이기
		System.out.println(target.substring(11));
		// 11번째 문자 꺼내기
		System.out.println(target.substring(11,16));
		// 11~16자리의 문자 꺼내기
		System.out.println(target.replace('o','O'));
		// o 문자 O로 변경
		System.out.println(target.replace("java","Python"));
		// 문자열도 가능
		System.out.println(target.toLowerCase());
		// 소문자로 변경
		System.out.println(target.toUpperCase());
		// 대문자로 변경
		
		
		
		
	}
}
