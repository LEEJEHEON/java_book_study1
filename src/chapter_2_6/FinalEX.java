package chapter_2_6;

public final class FinalEX {
	public final String FANAL_VALUE = "TEST";
	
	public FinalEX() {
		// 생성자는 final 불가능		
	}
	
	public final String getInfo() {
		return "Constants FINAL_VALUE is : " + FANAL_VALUE;
	}
}
