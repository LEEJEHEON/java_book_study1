package chapter_1_2;

public class VariableHashcode {
	public static void main(String[] args) {
		long varLong1 = 32L;
		long varLong2 = 32L;
		int varInt1 =32;
		
		System.out.println("varLong1 : "+ System.identityHashCode(varLong1));
		System.out.println("varLong2 : "+ System.identityHashCode(varLong2));
		// 변수는 다르지만, 값은 같으므로 동일한 주소를 가르키고 있다.
		
		System.out.println("varInt1 : "+ System.identityHashCode(varInt1));
		// 변수형이 달라서 다른 값으로 인식
		
		int varInt2 = (int) varLong2;
		long varLong3 = (long) varInt1;
		System.out.println("varInt2 : " + System.identityHashCode(varInt2));
		System.out.println("varLong3 : " + System.identityHashCode(varLong3));
		// 변경된 값이 있는 메모리 주소값을 가르킨다.
		
		String str1 = String.valueOf(varLong1);
		String str2 = String.valueOf(varInt1);
		String str3 = String.valueOf(varLong1);
		System.out.println("str1 : "+System.identityHashCode(str1));
		System.out.println("str2 : "+System.identityHashCode(str2));
		System.out.println("str3 : "+System.identityHashCode(str3));
		// 모든 주소값이 다르다. String.valueOf() 는 매번 새로운 데이터를 생성해서 그렇다.
		
		
		// identityHashCode : jvm 메모리영역에 저장된 변수의 위치를 반환(해시코드 주소명)
		
		
	}
	
}
