package chapter_2_5;

public class ConstructorLauncher {
	public static void main(String[] args) {
		ConstructorEX exam1 = new ConstructorEX();
		ConstructorEX exam2 = new ConstructorEX("Second");
		// new 로 객체를 생성할 때마다 jvm은 힙영역에 객체를 위한 데이터 영역에 할당 (서로 중복x)
		
		System.out.println(System.identityHashCode(exam1));
		System.out.println(System.identityHashCode(exam2));
		
		
	}
}
