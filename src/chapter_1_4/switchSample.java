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
		// stamp가 7개 이상이면 조건식의 결과값이 0,1,2에 해당하지 않아서 default가 실행
		
		// 매개변수로 4를 넣으면 break를 넣지 않아서 case1, case2, default가 실행된다.
		}
		
	}
}
