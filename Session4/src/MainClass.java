
public class MainClass {
	public static void main(String[] args){
		//Rectangle rect = new Rectangle(3,4,5);
		Rectangle rect = new Rectangle(3); //this is for 2nd constructor
		//int volume = rect.volume(); //
		//System.out.println(volume); // if  i need to call value multiple times
		/*rect.h = 5;
		rect.l = 4;
		rect.w = 4;*/
		System.out.println("Volume "+rect.volume()); // these three are used to call a value if i need to call/use value 1 time
		rect.volume(5);
	}

}
