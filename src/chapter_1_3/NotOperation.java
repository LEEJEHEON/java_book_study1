package chapter_1_3;

public class NotOperation {
	public static void main(String args[]) {
		boolean isWorking = false;
		
		isWorking = !isWorking;
		
		System.out.println("isWorking : " + isWorking);
		isWorking = !isWorking;
		System.out.println("isWorking : " + isWorking);
		
	}
}
