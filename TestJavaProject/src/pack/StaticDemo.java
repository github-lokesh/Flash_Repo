package pack;

class Emp{
	int eid;
	int sal;
	String ceo;
	static String comp;
	//cannot access non-static var. inside a 
	//static method
	static{ //loading a class
	comp="My_Company";	
	System.out.println("in static");
	}
	
	public Emp(){ //create an object
		eid=50;
		sal=7070;
		ceo="my_CEO";
		System.out.println("in constructor");
	}
	//static String ceo; --> goes into the class loader memory and not into heap memory
	// now this var is class specific and not object specific.
	
	public void show(){
		System.out.println(eid+" : "+sal+" : "+ceo);
	}
}

public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Emp n1 --> Reference in stack memory
		//new Emp(); --> Object in Heap memory
		
		//--Class file is loaded in JVM memory --> class loader memory
		Emp n1= new Emp();
		/*n1.eid=10;
		n1.sal=100;
		n1.ceo = "n1.ceo";*/
		Emp n2= new Emp();
		/*n2.eid=20;
		n2.sal=200;
		n2.ceo = "n2.ceo";*/
		n1.show();
		n2.show();
	}

}

//reference of super class and object of sub class 