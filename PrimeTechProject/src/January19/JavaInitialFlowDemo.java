package January19;

public class JavaInitialFlowDemo {
	public static void main(String[] args) {
		//System.out.println(JavaInitializationFlow.staticVar2);
		/*
		 * Order:
		 * 1. Static code block 1
		 * 2. Static code block 2
		 * 3. Initialize staticVar1 = null
		 * 4. Initialize staticVar2 = null
		 */
		
		System.out.println("---------");
		
		JavaInitializationFlow obj = new JavaInitializationFlow();
		System.out.println(obj.instanceVar1);
		/*
		 * Order w/o line 5:
		 * 1. Static code block 1
		 * 2. Static code block 2
		 * 3. Non-Static code block 1
		 * 4. Non-Static code block 2
		 * 5. Initialize instanceVar1 = null
		 * 6. Initialize instanceVar2 = null
		 */
	}
}
