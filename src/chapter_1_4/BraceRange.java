package chapter_1_4;

public class BraceRange {
	public static void main(String args[]) {
		float price1 = 2.99F;
		System.out.println("price1 variable : "+ price1);
		
		// if ���� ����
		if (args != null && args.length > 0 ) {
			float price2 = 3.99F;
			price1 += price2;
			System.out.println("price1 variable : " + price1);
			System.out.println("price2 variable : " + price2);	
		}
		// if�� �ȿ��� ����� price2�� if���� ������ ����� ����� �� ����.
		
		
	}
}
