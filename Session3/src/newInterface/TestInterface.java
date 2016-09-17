package newInterface;

public interface TestInterface extends SecondInterface, ThirdInterface {
	
	public void method1();
	
	static void method2(){ //we can also define static method with body in interface
		
	}
	
	default void method3(){ 
		System.out.println(""); //default pacakage has scope within the package that's why we can define it's body
	}

}
