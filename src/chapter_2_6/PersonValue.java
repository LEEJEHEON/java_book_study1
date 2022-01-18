package chapter_2_6;

// 상속할 부모 클래스
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
