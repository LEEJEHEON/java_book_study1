package chapter_2_6;

public class LongHandler extends AbstractHandler {
	public static void main(String args[]) {
		LongHandler longHandler = new LongHandler();
		System.out.println(longHandler.getRangeInfo());
			
	}
	
	public String getRangeInfo() {
		long max = Long.MAX_VALUE;
		long min = Long.MIN_VALUE;
		
		String rt = "FROM : " + min + ", TO : " + max;
		return rt;
	}
}
