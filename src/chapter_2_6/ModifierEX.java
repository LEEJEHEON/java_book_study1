package chapter_2_6;

public class ModifierEX {
	protected int uniqueClassId;
	
	public ModifierEX() {
		uniqueClassId = System.identityHashCode(this);
	}
	
	protected void printClassId() {
		System.out.println("Hashcode of ModifierEX object : " + this.uniqueClassId);
	}
}
