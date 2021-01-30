package iterator_concept;

import java.util.ArrayList;
import java.util.Iterator;

public class Array {

	public static void main(String[] args) {
		
		ArrayList<String> itCourse = new ArrayList<>();
		
		itCourse.add("DEVOPS");
		itCourse.add("QA");
		itCourse.add("AWS");
		itCourse.add("BIGDATA");
		itCourse.add("Cyber");
		System.out.println("Printing using iterator:");
		
		Iterator<String> iterator=itCourse.iterator();
		
		while (iterator.hasNext()) {
			String shows = iterator.next();
			System.out.println(shows);
		}
		
		System.out.println("\nusing for each loop------------");
		
		for (String string : itCourse) {
			System.out.println(string);
		}
		
		System.out.println("\n for loop with order/index----------");
		for (int i = 0; i <itCourse.size(); i++) {
			System.out.println(itCourse.get(i));
		}
	
	}
	
	
	

}
