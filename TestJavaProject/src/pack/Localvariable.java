package pack;

class LocalABC{
	int num1;
	int num2;
	
	public LocalABC(int num1,int num2){
		this.num1 = num1;
		this.num2 = num2;		
	}
	
	/*public LocalABC(int n1,int n2){
		num1 = n1;
		num2 = n2;		
	}*/
	//local variable always shadows instance variable
}

public class Localvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalABC abc = new LocalABC(1,2);
		System.out.println(abc.num1);
		System.out.println(abc.num2);
	}

}

