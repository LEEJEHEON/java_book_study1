package chapter_2_6;

public class IntegerHandler extends AbstractHandler {
	public static void main() {
		LongHandler longHandler = new LongHandler();
		System.out.println(longHandler.getRangeInfo());
	}
	
	public String getRangeInfo() {
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		
		String rt = "FROM : "+ min + ", TO : " + max;
		return rt;
	}
}
