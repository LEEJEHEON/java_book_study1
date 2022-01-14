package chapter_1_2;

public class floatSample {
	public static void main(String []args) {
		char TAB_CHAR ='\t';
		
		float price =2.99f;
		double pi = 3.1415926535897d;
		double tax = 0.0299e1;
		// 숫자 뒤에 접미사를 넣어서 어떠한 변수형인지 말해줌
		
		System.out.println("Variable price"+ TAB_CHAR + ": "+price);
		System.out.println("Variable pi"+ TAB_CHAR + ": "+pi);
		System.out.println("Variable tax"+ TAB_CHAR + ": "+tax);
		
		float maxFloatValue = Float.MAX_VALUE;
		float minFloatValue = Float.MIN_VALUE;
		
		System.out.println("Maxinum value"+ TAB_CHAR + ": "+maxFloatValue);
		System.out.println("Mininum value"+ TAB_CHAR + ": "+minFloatValue);
		
		System.out.println("Overflow"+ TAB_CHAR + ": "+maxFloatValue * 10);
		System.out.println("Underflow"+ TAB_CHAR + ": "+minFloatValue /100);
		// 오버플로우와 언더플로우 출력 
		
		
	}
}
