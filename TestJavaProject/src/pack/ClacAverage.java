package pack;

public class ClacAverage extends ParentClass {

/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double f1[] = new double[5];
		f1[0] = 1.0;
		f1[1] = 1.1;
		f1[2] = 1.2;
		f1[3] = 1.3;
		f1[4] = 1.4;
		for(int i=0;i<f1.length;i++)
			System.out.println(f1[i]);
		
		System.out.println("------------");
		
		float f2[] = new float[5];
		f2[0] = 1.0f;
		f2[1] = 1.1f;
		f2[2] = 1.2f;
		f2[3] = 1.3f;
		f2[4] = 1.4f;
		
		for (float f : f2)
			System.out.println(f);
	
	}*/

	@Override
	public void displayMethod(String msg){
		System.out.println("Message is: "+ msg);
	}
	public static void main(String args[]){
		String str[] = new String[10];
		ClacAverage obj = new ClacAverage();
		obj.displayMethod("Hey!!");
	}
}

class ParentClass
{
	public void displayMethod(String msg){
		System.out.println(msg);
	}
}

/*class SubClass extends ParentClass
{
	
}*/