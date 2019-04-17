/**
 * 
 */
package Arrays;
//https://javaconceptoftheday.com/interesting-observations-about-arrays-in-java/
/**
 * @author LS28889
 *
 */
public class anonymousArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//anonymous array i.e an array without reference.
		//Creating anonymous array

		System.out.println(new int[]{1, 2, 3}.length); //Output : 3

		System.out.println(new int[]{47, 21, 58, 98}[1]); //Output : 21
		
		//**************************************/
		
		// While assigning one array reference variable to another,
		// compiler checks only type of the array not the size.
		
		int[] a = new int[10];

		int[] b = new int[100];

		double[] c = new double[20];

		a = b;
		
		//b = c; //Compile Time Error : can not convert from double[] to int[]
		
		
		
		//**************************************/
		/*The size of an array can not be changed once you define it.
		You can not insert or delete array elements after creating an array.
		Only you can change is the value of the elements. This is the main drawback of arrays.*/
		
	}

}
