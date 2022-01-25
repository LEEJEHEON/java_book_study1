package chapter_2_6;

public class SystemGenerator implements GeneratorInterface {
	public static void main(String[] args) {
		SystemGenerator sysGenerator = new SystemGenerator();
		String uniqueId = sysGenerator.getUniqueValue();
		
		System.out.println("Genrate unique id : " + uniqueId );
		
	}
	
	public String getUniqueValue() {
		String rt = SystemGenerator.ID_HEAD + System.nanoTime()+ SystemGenerator.DELIMITER + System.identityHashCode(this);
		return rt;
	}
	
}
