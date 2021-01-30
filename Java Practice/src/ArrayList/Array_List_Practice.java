package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Array_List_Practice {

	public static void main(String[] args) {
		
		ArrayList<String> aList= new ArrayList<String>();
		
		aList.add("F");
		aList.add("E");
		aList.add("D");
		aList.add("C");
		aList.add("B");
		aList.add("A");
	
		Collections.sort(aList);
		
		for (int i = 0; i < aList.size(); i++) {
			System.out.println(aList.get(i));
		}
	

	}

}
