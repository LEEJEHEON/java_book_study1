package chapter_1_3;
import java.util.Scanner;

public class TenaryOperator {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = (a>b) ? (a-b) :(b-a);
		// if-else구문과 비슷한 역할
		
		System.out.println((a>b) ? " A > B " : "B >= A");
		System.out.println("difference : " + c);
				
	}
	
}
