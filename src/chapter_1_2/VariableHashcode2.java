package chapter_1_2;

public class VariableHashcode2 {
	public static void main(String []args) {
		String str1 = null;
		String str2 = "";
		
		System.out.println("varStr1 : "+ System.identityHashCode(str1));
		System.out.println("varStr1 : "+ System.identityHashCode(str2));
		
	}
}
