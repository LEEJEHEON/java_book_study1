package chapter_1_2;

import java.util.Calendar;
import java.util.Date;

public class reference {
	public static void main(String[] args) {
		String lastName = "Lee";
		String firstName = new String("JeHeon");
		
		Date endDate = new Date();
		Date nowDate = Calendar.getInstance().getTime();
		// ���� ������ Ŭ���� 
		
		System.out.println("My full name is "+ firstName + " "+lastName);
		System.out.println(endDate);
		System.out.println(nowDate);
	}
}
