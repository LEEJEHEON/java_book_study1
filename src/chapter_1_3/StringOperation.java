package chapter_1_3;

public class StringOperation {
	public static void main(String args[]) {
		String target = "Welcome to java world";
		
		System.out.println(target.concat(" and Gilbut press"));
		// ���� ���̱�
		System.out.println(target.substring(11));
		// 11��° ���� ������
		System.out.println(target.substring(11,16));
		// 11~16�ڸ��� ���� ������
		System.out.println(target.replace('o','O'));
		// o ���� O�� ����
		System.out.println(target.replace("java","Python"));
		// ���ڿ��� ����
		System.out.println(target.toLowerCase());
		// �ҹ��ڷ� ����
		System.out.println(target.toUpperCase());
		// �빮�ڷ� ����
		
		
		
		
	}
}
