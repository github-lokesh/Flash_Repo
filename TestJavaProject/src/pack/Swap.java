package pack;

public class Swap {
	public static void swap(Integer i, Integer j) { 
		Integer temp = new Integer(i); 
		i = j; 
		j = temp; 
	} 
	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Test.java 
		//class Test { 
		// swap() doesn't swap i and j 	
		public static void main(String[] args) { 
			//Integer i = new Integer(10); 
			//Integer j = new Integer(20); 
			int i=10;
			int j=20;
			swap(i, j); 
			System.out.println("i = " + i + ", j = " + j); 
		} 
		//} 

	//}

}
