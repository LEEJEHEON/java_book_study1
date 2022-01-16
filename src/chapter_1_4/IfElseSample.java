package chapter_1_4;
import java.util.Scanner;

public class IfElseSample {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int stampCount = Integer.parseInt(sc.next());
		
		if(stampCount >= 0 && stampCount < 3)
			System.out.println("need more stamps");
		else if(stampCount >=3 && stampCount<6)
			System.out.println("Free cookie");
		else if(stampCount >=6)
			System.out.println("Free Coffee");
		else
			System.out.println("Useless coupon");
		
		
	}
}
