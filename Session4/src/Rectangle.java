
public class Rectangle {
	public int h,w,l;
	
	public Rectangle(int width,int hgt,int length){
		h = hgt;
		w = width;
		l = length;
	}
	
	public Rectangle(int a){ // 2nd constructor
		h = a;
		w = a;
		l = a;
	}
	
	/*public Rectangle(){
		
	}*/
	
	public int volume(){
		int v = h*w*l;
		return v;
	}
	
	public void volume(String cube){
		
	}
	
	public void volume(int cube){
		
	}

}
// constructor is a type of function which has no return type it should be same as name of the class
// multiple constructor can be defined in a class but name has to be different
// method overloading or constructor overloading when multiple constructor with same name constructor are used multiple times
// since only one type of method is defined in a class at a time
// if constructor is private its variable can be defined once and it is called single tree or something
// difference is only on the basis of argument and not on the return type (int, void) that's why volume is throwing error at method defining type
//method overloading and constructor overloading
//garbage heap is the basic read it today