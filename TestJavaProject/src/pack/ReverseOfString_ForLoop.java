package pack;

import java.util.ArrayList;
import java.util.List;


public class ReverseOfString_ForLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String is a immutable object
		
		String s = "Java_Complete_Tutorial";
		int len = s.length();
		String rev="";
		for(int i=len-1;i>=0;i--)
		{
			//System.out.println("s");
			//rev=+s.charAt(i);
			rev=rev+ s.charAt(i);
		}
		System.out.println("Rev Str "+rev);
		/*List<String> list = new ArrayList<String>();
		list .add("Hello");
		Integer i = list.get(0);*/
	}

}