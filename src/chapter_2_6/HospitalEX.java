package chapter_2_6;

public class HospitalEX {
	public static void main(String args[]) {
		DoctorValue doctorVO = new DoctorValue();
		NurseValue nurseVO = new NurseValue();
		PatientValue patientVO = new PatientValue();
		PersonValue personVO = new PersonValue();
		
		System.out.println("Doctor Info : "+ doctorVO.getInfo());
		System.out.println("Nurse Info : "+ nurseVO.getInfo());
		System.out.println("Patient Info : "+ patientVO.getInfo());
		System.out.println("Person Info : "+ personVO.getInfo());
	// Ŭ�������� �θ�Ŭ������ ��ӹ޾Ƽ� ���� �ٸ��� ���־��� ������ ��� �� �ٸ����� ���� 	
	// 1:n ���� (�θ�� ���� �ڽĿ��� ��Ӱ���, �ڽ��� �� �θ����׸� ��ӹ��� �� �ִ�.)
	}
}
