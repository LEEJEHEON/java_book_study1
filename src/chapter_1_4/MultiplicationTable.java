package chapter_1_4;

public class MultiplicationTable {
	public static void main(String args[]) {
		if (args == null || args.length !=1)
		{
			System.out.println("Usage : java MultiplicationTabble [number]");
			return;
		}
		
		int seedNumber = Integer.parseInt(args[0]);
		
		for (int i =1 ; i<=9; i++) {
			System.out.println(seedNumber + " x " + i + " = " + (seedNumber * i));
		}
		
	}
}
