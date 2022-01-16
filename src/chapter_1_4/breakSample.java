package chapter_1_4;

public class breakSample {
	public static void main(String args[]) {
		int i =0;
		while (true) {
			System.out.print(i++);
			if (i > 100)
				break;
			System.out.print(", ");
			
		}
		
	}
}
