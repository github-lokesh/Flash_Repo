package Arrays;

import java.util.Arrays;
import java.util.Collections;

class AnArray {
	int i;
}
public class ReturrningAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=test();
		Arrays.sort(a);
		
		for (int j=0;j<a.length;j++){
			System.out.println(a[j]);
		}
		System.out.println("--------------------");
		for (int i:a)
			System.out.println(i);
		System.out.println("*********************");
	}

	public static int[] test(){
		int arr[]= {1,2,3,4,5};
		int arr1[]= {7,9,8,3,5};
		return arr1;
	}
}

/*Passing Array Of Primitive Type As A Parameter to The Method 
Passing Array Of Derived Type As A Parameter to The Method
Method Returning An Array Of Primitive Type
Method Returrning An Array Of Derived Type*/
