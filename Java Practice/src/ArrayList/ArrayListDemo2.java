package ArrayList;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList<String> ar1= new ArrayList<String>();
		ar1.add("Java");
		ar1.add("C++");
		ar1.add("C#");
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Java");
		ar2.add("Ruby");
		ar2.add("Json");
		
		ar1.addAll(ar2);
		for (int i = 0; i < ar1.size(); i++) {
			System.out.println("addAll :"+ar1.get(i));			
		}
		
		//remove all
		ar1.removeAll(ar2);
		for (int i = 0; i < ar1.size(); i++) {
			System.out.println("removeAll :"+ar1.get(i));			
		}
		
		ArrayList<String> ar3= new ArrayList<String>();
		ar3.add("Java");
		ar3.add("C++");
		ar3.add("C#");
		
		ArrayList<String> ar4 = new ArrayList<String>();
		ar4.add("Java");
		ar4.add("Ruby");
		ar4.add("Json");
		//retainAll (common)
		ar3.retainAll(ar4);
		for (int i = 0; i < ar3.size(); i++) {
			System.out.println("common :"+ar3.get(i));			
		}
	}

}
