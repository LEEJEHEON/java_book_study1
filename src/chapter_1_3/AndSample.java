package chapter_1_3;

public class AndSample {
	public static void main(String args[]) {
		if (args != null && args.length > 0)
			for (String arg : args)
				System.out.println(arg);
		
	}
}
