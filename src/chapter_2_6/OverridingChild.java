package chapter_2_6;
import java.util.Date;

public class OverridingChild extends OverridingParent {
	public static void main(String[] args) {
		OverridingParent parent = new OverridingParent();
		OverridingChild child = new OverridingChild();
		
		System.out.println("Now DATE : " + parent.getDate());
		System.out.println("Now DATE : " + child.getDate());
	}
	
	public String getDate() {
		Date date = new Date();
		String[] items = date.toString().split(" ");
		
		String msg = "YEAR = " + items[5];
		msg += ", Month = " + items[1];
		msg += ", Day = " + items[2];
		
		return msg;
	}
}
