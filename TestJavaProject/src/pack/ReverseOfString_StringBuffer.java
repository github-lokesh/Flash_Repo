package pack;

import java.util.ArrayList;
import java.util.List;


public class ReverseOfString_StringBuffer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//StringBuffer is a immutable object
		
		String s = "Java_Complete_Tutorial";
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());
	}

}