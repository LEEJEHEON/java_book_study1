package chapter_2_6;

// ����� �θ� Ŭ����
public class PersonValue {
	protected int age;
	protected String name;
	
	public PersonValue() {
		age = 0;
		name ="Someone name";
	}
	
	public String getInfo() {
		String rt = new String();
		rt = "age : "+ age + ", name : " + name;
		return rt;
	}
}
