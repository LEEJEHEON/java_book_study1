package chapter_1_2;

public class CastingSample {
	public static void main(String args[]){
		int avgSalary = 1300000;
		int employee = 10;
		int storeNumber = 1300;
		int annualExpense1 = avgSalary * employee * 12 * storeNumber;
		
		long annualExpense2 = (long) avgSalary * employee * 12 * storeNumber;
		
		System.out.println("Annual Expense : " + annualExpense1);
		System.out.println("Annual Expense : " + annualExpense2);
		// int 형은 데이터 손실 현상이 발생됨
		// long은 제대로 값이 다 나옴
		
	}
}
