
public class SwitchImplementation {
	/**
	 * This method shows how switch works
	 * and it takes only string parameter
	 * and also print default value if  no case method
	 * @param name
	 */
	public void SwitchCase (String name) {
		//name = Test;
		switch (name) {
		case "Joey":
			System.out.println("TestOne User");
			System.out.println("TestOne User");
			System.out.println("TestOne User");
			break;
		case "Shahid":
			System.out.println("TestTwo User");
			System.out.println("TestTwo User");			
			System.out.println("TestTwo User");
			break;
		default:
			System.out.println("Nothing to execute");
			break;
		}
	}
	
}
