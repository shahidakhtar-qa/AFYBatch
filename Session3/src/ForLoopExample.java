
public class ForLoopExample {
	public void searchNumber(){
		for (int i=0;i<=10;i++){
			System.out.println(i);
		}
		System.out.println("Out of Loop");
	}
	public void findNumber(int a[], int number1){
		int i=0;
		for(;i<a.length;){
			if (a[i]==number1){
				System.out.println("Number is present at position "+i);
			}
			i++;
		}
	}
	public void search(int a[], int number1){
		int i = a.length;
		while(i>0){
			if(a[i]==number1){
				System.out.println("jj");
			}
			System.out.println("In loop");
			i--;
			//i = i-1; same as above
		}
	}

}
