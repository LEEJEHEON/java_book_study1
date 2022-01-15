package chapter_1_3;
import java.util.Scanner;

public class StringOperation4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String number = "1234567890";
		
		String str = sc.next();
		String temp = str.toLowerCase();
		
		int alphabetIdx = alphabet.indexOf(temp);
		int numberIdx = number.lastIndexOf(temp);
		
		System.out.println("Input character : "+ str);
		System.out.println("Alphabet? : "+ ((alphabetIdx >=0) ? "true" : "false"));
		System.out.println("Number? : "+ ((numberIdx >=0) ? "true" : "false"));
		
		
	}
}
