package chapter_1_4;

public class switchSample2 {
	public static void main(String args[]) {
		
		String member = "Silver";
		
		switch (member) {
		
		case "silver":
			System.out.println("go to upstair");
			break;
		case "Silver":
			System.out.println("go to downstair");
			break;
		case "gold":
			System.out.println("go to limousine");
			break;
		// 대소문자를 구분하니.. 주의
		
		}
	}
}
