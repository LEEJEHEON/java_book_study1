package chapter_1_4;

// 피보나치 수열
public class WhileSample {
	public static void main(String args[]) {
		int first = 1;
		int second = 0;
		int third = 0;
		
		int count =0;
		while(count ++ < 10) {
			System.out.println(first + "\t");
			third = second;
			second = first ;
			first = second + third;
			
		}
		
	}
}
