package chapter_2_6;

import java.util.Date;

public class StaticEX {
	
	// static 으로 선언된 클래스 변수들
	public final static int RT_SUCCESS;
	public final static int RT_ERROR;
	public final static String ERR_MSG;
	// public final static int RT_SUCCESS=0; 이렇게 한줄로 초기화도 가능
	
	// static 초기화
	static {
		RT_SUCCESS = 0;
		RT_ERROR = -1;
		ERR_MSG = "Found error";	
	}
	
	// static 메소드
	public static String getCurrentTime() {
		Date date = new Date();
		return date.toString();
		
	}
}
