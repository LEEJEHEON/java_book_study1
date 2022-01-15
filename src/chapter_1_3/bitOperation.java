package chapter_1_3;

public class bitOperation {
	public static void main(String args[]) {
		int b1 = 0B0010;
		int b2 = 0B0101;
		int b3 = 0B1111;
		
		int rtAndOp = b1 & b3 ;
		// bit AND
		int rtOrOp = b1 | b2;
		// bit OR
		int rtXorOp = b1 ^ b3;
		// bit XOR : 같으면 0 다르면 1
		
		System.out.println("b1 AND b3 : " + Integer.toBinaryString(rtAndOp));
		// 0010
		System.out.println("b1 OR b3 : " + Integer.toBinaryString(rtOrOp));
		// 0111
		System.out.println("b1 XOR b3 : " + Integer.toBinaryString(rtXorOp));
		// 1101
		
	}
	
}
