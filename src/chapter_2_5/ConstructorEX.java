package chapter_2_5;

public class ConstructorEX {
	public ConstructorEX() {
		System.out.println("First construcrtor is called");
	}
	
	public ConstructorEX(String str) {
		System.out.println("Second constructor is called with parameter : "+str);
	}
	
	// 한 개의 클래스는 여러 개의 생성자를 가질 수 있지만 중복되어서는 안됨
}
