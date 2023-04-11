package January19;

public class JavaInitializationFlow {

	static {
		System.out.println("Static code block 1");
	}
	
	static {
		System.out.println("Static code block 2");
	}
	
	{
		System.out.println("Non-Static code block 1");
	}
	
	{
		System.out.println("Non-Static code block 2");
	}
	
	String instanceVar1;
	String instancevar2; 
	static String staticVar1;
	static String staticVar2;
	
	public JavaInitializationFlow(){
		System.out.println("Constructor");
	}
}
