package chapter_2_6;

import java.util.UUID;

public class ServiceGenerator implements GeneratorInterface {
	public static void main(String[] args) {
		ServiceGenerator svcGenerator = new ServiceGenerator();
		String uniqueId = svcGenerator.getUniqueValue();
		System.out.println("Generate unique ID : " + uniqueId);
	}
	
	public String getUniqueValue() {
		String rt = ServiceGenerator.ID_HEAD + UUID.randomUUID();
		return rt;		
	}
}
