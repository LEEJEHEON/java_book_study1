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
	// 클래스마다 부모클래스를 상속받아서 값을 다르게 해주었기 때문에 모두 다 다른값이 나옴 	
	// 1:n 관계 (부모는 여러 자식에게 상속가능, 자식은 한 부모한테만 상속받을 수 있다.)
	}
}
