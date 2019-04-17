package pack;

public class Singleton {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Abc pbj1 = new Abc();
	}
}

class Abc{
	static Abc obj = new Abc();
	private Abc(){
	}
	public static Abc get(){
		return obj;
	}
}