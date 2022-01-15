package chapter_1_3;

public class bitNotOperation {
	public static void main(String args[]) {
		int i = 10;
		System.out.println("Variable i (Decimal) : " + i);
		System.out.println("Variable i (Binary) : " + Integer.toBinaryString(i));
		// toBinaryString �Ű������� 2������ ǥ���ϴ� �޼ҵ�
		// 8���� : Integer.toHexString();
		// 16���� : Integer.toOctalString();
		
		i = ~i;
		// ��Ʈ ������ not
		
		System.out.println("Variable i (Decimal) : " + i);
		System.out.println("Variable i (Binary) : " + Integer.toBinaryString(i));
		// int�� 32��Ʈ�� 0�� �� 1�� ���� 
		// 11111111111111111111111111110101 = -11
	}
}
