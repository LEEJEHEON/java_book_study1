package chapter_2_6;

public interface GeneratorInterface {
	public static final String ID_HEAD = "UNIQUE";
	public static final String DELIMITER = "_";
	
	public abstract String getUniqueValue();
	// adstaract는 생략가능
}
