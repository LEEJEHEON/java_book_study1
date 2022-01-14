package chapter_1_2;

public class dataType_number {
	public static void main(String args[]) {
		System.out.println("byte range : " + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);
		System.out.println("short range : " + Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);
		System.out.println("int range : " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
		System.out.println("long range : " + Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);
		// 최소값이랑 최댓값 출력하여 range print
		
		byte vlu = 0;
		
		// 0부터 300미만까지 루프를 돌림
		for (int i=0; i <300 ;i++)
			System.out.println(vlu++);
		// 127에서 overflow가 발생하여 다음은 -128으로 변경되고 ++됨 
		
		
	}
}
