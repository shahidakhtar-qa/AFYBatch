
public class ParentClass {
	
	private String name = "Calc Version 1";
	
	public int add(int a,int b){
		int c= a+b;
		return c;
	}
	
	public int add(int[] a){ //overloading method name same function different
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		return sum;
	}
	
	public long add(long[] a){ 
		long sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		return sum;
	}

}
