package chapter_1_3;

public class StringOperation6 {
	public static void main(String args[]) {
		System.out.println("���� ���õ� ������ format");
		System.out.println(String.format("%,d" , 1000000));
		System.out.println(String.format("%,.2f" , 1000000F));
		
		System.out.println("\n ���ڿ� �ڸ��� ���ߴµ� ������ format");
		System.out.println(String.format("%10s" , "abcde"));
		System.out.println(String.format("%10s" , "abcdefghujklmnopqr"));
		// ����� ��� ������
		
		System.out.println("\n�ε� �Ҽ����� ���� ������ format");
		System.out.println(String.format("%.2f" , 12345.121245)); // 12345.12
		System.out.println(String.format("%.2f" , 12.1)); // 12345.10
		
		
	}
}
