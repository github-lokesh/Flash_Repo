package pack;
class Outer{
	int i;
	public void show(){
	System.out.println("Inside show");	
	}
	class Inner{ //Outer$Inner.class
		public void display(){
			System.out.println("Inside display");
		}	
	}
	static class Inner2{ //Outer$Inner.class
		public void display(){
			System.out.println("Inside display2");
		}	
	}
}
public class InnerDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer out = new Outer();
		out.show();
		
		//classname		 //consturctor
		Outer.Inner in = out.new Inner();
		in.display();
		
		Outer.Inner2 in1 = new Outer.Inner2();
		in1.display();
	}
}