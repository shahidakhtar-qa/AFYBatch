package newInterface;

public class TestClass2 implements TestInterface{

	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("I am in test class");
	}
	
	public static void main(String args[]) {
		//TestInterface test = new TestInterface(); can't intantiate an interface
		TestInterface test = new TestClass2();
		
	}

	public void getNo() {
		// TODO Auto-generated method stub
		
	}

	public void sendSMS() {
		// TODO Auto-generated method stub
		
	}

//	public static void method2() {
//		// TODO Auto-generated method stub
//		
//	}

	public void method3() {
		// TODO Auto-generated method stub
		
	}

	public static void method2() {
		// TODO Auto-generated method stub
		
	}
	
	

}
