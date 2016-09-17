
public class MainClass {
	/*public static void main(String[] args){
		ParentClass p = new ChildClass(); //dynamic polymorphism is dynamic binding or run time polymorphism
		ChildClass ob = new ChildClass();
		ob.add(5, 4);
		ob.sub(5, 3);
		System.out.println(ob.name);
	}*/
	
	public static void main(String[] args){
		Object p = new ChildClass(); //dynamic polymorphism is dynamic binding
		ParentClass p1 = new ChildClass();
		//p.
		/*ChildClass ob = new ChildClass();
		ob.add(5, 4);
		ob.sub(5, 3);
		System.out.println(ob.name);*/
	}
	
	/*public static void main(String[] args){
		/*ForLoopExample obj = new ForLoopExample();
		int arr[] = {1,2,3,4};
		//obj.findNumber(arr, 3);
		//obj.searchNumber(i);
		obj.search(arr, 3);
	}*/
	
	/*public int getObjectOfClassExample(){
		//ForLoopExample obj1 = new ForLoopExample();
		int obj1 = 1;
		return obj1;
	}*/
	
	/*public ForLoopExample[] getObjectOfClassExample(){
		ForLoopExample obj1 = new ForLoopExample();
		ForLoopExample obj2 = new ForLoopExample();
		ForLoopExample obj3 = new ForLoopExample();
		ForLoopExample a[] = (obj1,obj2,obj3);
		//int obj1 = 1;
		return a;
	}*/
	
	public int[] getObjectOfClassExample1(){
		int i = 1;
		int j = 2;
		int k = 3;
		int arr[] = {i,j,k};
		return arr;
	}
	/*public static void main(String[] args){
		ChildClass ob = new ChildClass(); // new "childClass" is constructor
		int a = 4;
		int b = 2;
		int s = ob.add(a, b);
		System.out.println(s);
		//ob.add(a, b); this way obj are declared but above method print and below method accept value but don't print
		ob.add(5, 4);
		ob.sub(7, 4);
		//System.out.println(ob.name);
		ob.mul(5, 6);
		System.out.println(ob.mul(5, 6));
		int x = ob.mul(3, 4);
		System.out.println(x); // above 3 are ways to print a value
		// parent has add if child too has add what will be done : called 
	}*/
}
