package chapter_2_6;

public class CastingExample {
	public static void main(String args[]) {
		CastingExample castingExam = new CastingExample();
		String str = new  String("String");
		double d = 3.24D;
		int i = 1;
		long l = 324L;
		float f =3.14F;
		
		System.out.println(castingExam.getType(str));
		System.out.println(castingExam.getType(d));
		System.out.println(castingExam.getType(i));
		System.out.println(castingExam.getType(l));
		System.out.println(castingExam.getType(f));
		
	}
	public String getType(Object obj) {
		String rt =null;
		
		if(obj instanceof String)
			rt = "String Object";
		else if (obj instanceof Double)
			rt = "Double Object";
		else if (obj instanceof Integer)
			rt = "Integer Object";
		else if (obj instanceof Long)
			rt = "Long Object";
		else 
			rt = "Unknown object";
		
		return rt;	
		
	}
	
}
