package pack;

public class ArraysInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {12, 21, 0, 5, 7};
		int[] b = a;
		
		for (int i : b)
			System.out.println("Elements in array b are "+ i);
		
	}

}

/*
 * 
 *
DO NOT USE THIS METHOD -> as changing the value of one array will be reflected in another array also 
int[] a = {12, 21, 0, 5, 7};   //Declaring and initializing an array of ints
int[] b = a;             //copying array 'a' to array 'b'

************************
1st Method
************************
int[] a = {12, 21, 0, 5, 7};   //Declaring and initializing an array of ints

		int[] b = new int[a.length];             //Declaring and instantiating another array of ints with same length

		for (int i = 0; i < a.length; i++)
		{
			b[i] = a[i];
		}
		
************************
2nd Method
************************

int[] a = {12, 21, 0, 5, 7};   //Declaring and initializing an array of ints
        //creating a copy of array 'a' using copyOf() method of java.util.Arrays class
int[] b = Arrays.copyOf(a, a.length);  



************************
3rd Method
************************
int[] a = {12, 21, 0, 5, 7};   //Declaring and initializing an array of ints
        //creating a copy of array 'a' using clone() method
int[] b = a.clone(); 


************************
4th Method -> Using arraycopy() method of System class, you can copy a part of an array into another array.
src - the source array.
srcPos - starting position in the source array.
dest - the destination array.
destPos - starting position in the destination data.
length - the number of array elements to be copied
************************
int[] a = {12, 21, 0, 5, 7};   //Declaring and initializing an array of ints
        //Creating an array object of same length as array 'a'
int[] b = new int[a.length];
        //creating a copy of array 'a' using arraycopy() method of System class
System.arraycopy(a, 0, b, 0, a.length);
*
*
*/