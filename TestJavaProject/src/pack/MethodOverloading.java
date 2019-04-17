package pack;

import java.util.Arrays;

class test{
	public void add(int i, int j){
		System.out.println(i+j);
		System.out.println("-----");
	}
	public void add(int i, int j, int k){
		System.out.println(i+j+k);
		System.out.println("-----");
	}
	public void add(int ... i){ //varargs  - variable args
		//JAVA implementation of varargs
		//Arrays.asList()
		//System.out.println(i+j+k);
		for (int a : i){
			System.out.println(a);
		}
	}
}
public class MethodOverloading {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test t =new test();
		t.add(2,3);
		t.add(2,3,4);
		t.add(1,2,3,4,5,6,7);
	}
}