package chapter_2_6;

public class GeneratorEX {
	public static void main(String args[]) {
		ServiceGenerator svc = new ServiceGenerator();
		SystemGenerator sys = new SystemGenerator();
		
		String svcName = svc.getClass().getSimpleName();
		
		if(svc instanceof GeneratorInterface)
			System.out.println(svcName + " is a instance of GeneratorInterface");
		else
			System.out.println(svcName + " is not a instance of Generator Interface");
		
		if(svc instanceof ServiceGenerator)
			System.out.println(svcName + " is a instance of ServiceGenerator");
		else
			System.out.println(svcName + " is not a istance of Service Generator");
		
		String sysName = sys.getClass().getSimpleName();
		if (sys instanceof GeneratorInterface)
			System.out.println(sysName + " is a instance of GeneratorInterface");
		else
			System.out.println(sysName + " is not a instance of GeneratorInterface");
		
		if (sys instanceof SystemGenerator)
			System.out.println(sysName + " is a instance of SystemGenerator");
		else
			System.out.println(sysName + " is not a instance of SystemGenerator");
		
		GeneratorInterface genIf1 = (GeneratorInterface) sys;
		GeneratorInterface genIf2 = (GeneratorInterface) svc;
		
		
		
	}
}
