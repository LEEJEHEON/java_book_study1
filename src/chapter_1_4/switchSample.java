package chapter_1_4;

public class switchSample {
	public static void main(String args[]) {
		if (args == null || args.length== 0) {
			System.out.println("Usage : java CoffeeCoupon2 [countOfStamp]");
			return;
		}
		int stampCount = Integer.parseInt(args[0]);
		
		switch(stampCount /3) {
		
		case 0:
			System.out.println("Need more stamp");
			break;
		case 1:
			System.out.println("Free cookie");
		case 2:
			System.out.println("Free Order");
		default:
			System.out.println("Useless coupon");
		break;
		// stamp�� 7�� �̻��̸� ���ǽ��� ������� 0,1,2�� �ش����� �ʾƼ� default�� ����
		
		// �Ű������� 4�� ������ break�� ���� �ʾƼ� case1, case2, default�� ����ȴ�.
		}
		
	}
}
