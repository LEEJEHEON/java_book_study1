package chapter_2_5;

public class MethodEX {
	public MethodEX() {
		
	}
	
	public static void main(String[] args) {
		String firstName = "ben";
		String lastName = "Davis";
		
		MethodEX exam1 = new MethodEX();
		
		String fullName = exam1.merge(firstName,lastName);
		int nameLength = exam1.getLength(fullName);
		
		System.out.println("Full name = "+ fullName + ", Length = "+nameLength);
		
	}
	
	public int getLength(String str) {
		if(str == null || "".equals(str))
			return 0;
		
		return str.length();	
	}
	
	public String merge(String str1, String str2) {
		return str1 + " " + str2 ;
	}
}
