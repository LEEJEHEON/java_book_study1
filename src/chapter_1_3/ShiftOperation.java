package chapter_1_3;

public class ShiftOperation {
	public static void main(String args[]) {
		int x = -5;
		int y = 6;
		
		int rt1 = x << 4;
		int rt2 = x >> 2;
		int rt3 = y << 3;
		int rt4 = y >> 1;
		int rt5 = y >>> 3;
		
		System.out.println("Binary x : " + Integer.toBinaryString(x));
		// -5 * 2^4 = -5 * 16  = - 80
		System.out.println("Binary y : " + Integer.toBinaryString(y));
		System.out.println("left : " + rt1 + ", " + Integer.toBinaryString(rt1));
		System.out.println("right : " + rt2 + ", " + Integer.toBinaryString(rt2));
		System.out.println("left : " + rt3 + ", " + Integer.toBinaryString(rt3));
		System.out.println("right : " + rt4 + ", " + Integer.toBinaryString(rt4));
		System.out.println("unsigned right  : " + rt5 + ", " + Integer.toBinaryString(rt5));
		
		
		
	}
}
