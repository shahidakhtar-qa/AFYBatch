package newAbstract;

public class Test2 extends Test1{

	public void newNo() {
		// TODO Auto-generated method stub
		System.out.println("print new no");
	}
	
	public static void main(String args[]){
		
		//Test1 a = new Test1(); can't intantiate an abstract class
		Test1 a1 = new Test2(); //Test1 parent class is reference and Test2 is child class having vlaue
	}
	
	

}
