package session4;

public class ParentClass extends GrandParent {
	
	public String name = "Parent";
	
	public ParentClass(String name){
		super(name);
		System.out.println("Welcome to Parent"+name);
	}
	
	public ParentClass(String name2){
		super(name);
		System.out.println("Welcome to Parent"+name2);
	}
	
	public ParentClass(int a,int b){
		super("Grand Parent");
		System.out.println("Welcome to Parent"+name+","+name2);
	}
	
	//Method overriding
	public int add(int a, int b){
		return a+b;
	}
	
}
