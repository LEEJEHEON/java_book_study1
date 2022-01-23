package chapter_2_6;

public class ModifierTester extends ModifierEX{
	public static void main(String[] args) {
		//ModifierEX example = new ModifierEX();
		ModifierTester tester = new ModifierTester();
		tester.run();
		
//		example.printClassId();
//		
//		int hashcode = example.uniqueClassId;
//		
//		System.out.println("Double check. Hashcode : "+ hashcode);
		// 같은 hashcode 값이 나온다.
	}
	public void run() {
		this.printClassId();
		
		int hashcode = this.uniqueClassId;
		
		System.out.println("Double check. Hashcode : " + hashcode);
	}
	
}
