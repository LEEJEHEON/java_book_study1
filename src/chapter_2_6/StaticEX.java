package chapter_2_6;

import java.util.Date;

public class StaticEX {
	
	// static ���� ����� Ŭ���� ������
	public final static int RT_SUCCESS;
	public final static int RT_ERROR;
	public final static String ERR_MSG;
	// public final static int RT_SUCCESS=0; �̷��� ���ٷ� �ʱ�ȭ�� ����
	
	// static �ʱ�ȭ
	static {
		RT_SUCCESS = 0;
		RT_ERROR = -1;
		ERR_MSG = "Found error";	
	}
	
	// static �޼ҵ�
	public static String getCurrentTime() {
		Date date = new Date();
		return date.toString();
		
	}
}
