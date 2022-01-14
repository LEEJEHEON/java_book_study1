package chapter_1_2;

public class chapter1 {
	public static void main(String args[]) {
		char tab = '\t';
		char linefeed = '\n';
		char cReturn='\r';
		char dQuote ='\"';
		char sQuote='\'';
		char bSlash ='\\';
		// '' 문자라서 홀따올표
		
		System.out.println("1>ABCD" + tab + "EFG");
		// "" 문자열이라서 쌍따옴표
		
		System.out.println("2>ABCD" + linefeed + "EFG");
		System.out.println("3>ABCD" + cReturn + "EFG");
		System.out.println("4>ABCD" + dQuote + "EFG");
		System.out.println("5>ABCD" + sQuote + "EFG");
		System.out.println("6>ABCD" + bSlash + "EFG");
		
	}
}
