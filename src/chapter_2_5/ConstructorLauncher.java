package chapter_2_5;

public class ConstructorLauncher {
	public static void main(String[] args) {
		ConstructorEX exam1 = new ConstructorEX();
		ConstructorEX exam2 = new ConstructorEX("Second");
		// new �� ��ü�� ������ ������ jvm�� �������� ��ü�� ���� ������ ������ �Ҵ� (���� �ߺ�x)
		
		System.out.println(System.identityHashCode(exam1));
		System.out.println(System.identityHashCode(exam2));
		
		
	}
}
