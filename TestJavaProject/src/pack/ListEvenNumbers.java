package pack;

public class ListEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//define limit
		 int limit = 50;
		 int arr[] = new int[limit];
		 int j=0;
		 System.out.println("Printing Even numbers between 1 and " +
		limit);

		 for(int i=1; i <= limit; i++){
			 
				 // if the number is divisible by 2 then it is even
				 if( i % 2 == 0){
					 System.out.print(i + " ");
					 System.out.print("---------------------------------------- ");
					 //for(int j=0; j <arr.length; j++){
					 arr[j]=i;
					 j++;
					 //}
		 }
		 for (int a : arr)
			 System.out.println("Elements are "+ a);
		
		 }

	}

}
