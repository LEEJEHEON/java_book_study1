package chapter_1_4;

public class IfElseSample2 {
	public static void main(String args[]) {
		// 매개변수 검증 및 사용법 출력
		if(args == null || args.length !=2) {
			System.out.println("Usage : java OrderForm2 [Coffee name] , [number of coffee]");
			return;
		}
		
		// 매개변수에 따른 데이터 처리
		String coffeeName = args[0];
		if ("espresso".equalsIgnoreCase(coffeeName))
			{
			int count = Integer.parseInt(args[1]);
			String verb =(count==1)? "is" : "are";
			System.out.println("Here " + verb + " "+ args[1] + "cup(s) of " + coffeeName);
			}
		else
			System.out.println("Sorry. it is out of stock ");
		
		
	}
}
