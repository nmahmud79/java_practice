package iterator_concept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
		//‘Iterator’ is an interface which belongs to collection framework. 
		//It allows us to traverse the collection, access the data element and remove the data elements of the collection.
		//java.util package has public interface Iterator and contains three methods:

		//boolean hasNext(): It returns true if Iterator has more element to iterate.
		//Object next(): It returns the next element in the collection until the hasNext()method return true.
		//This method throws ‘NoSuchElementException’ if there is no next element.
		//void remove(): It removes the current element in the collection.
		//This method throws ‘IllegalStateException’ if this function is called before next( ) is invoked.
    
public class Array_List_Iterator {

	public static void main(String[] args) {
	
		ArrayList<String> tvSeries = new ArrayList<String>();
		
		tvSeries.add("Game of Thrones");
		tvSeries.add("Bearking Bad");
		tvSeries.add("The Big Bang Theory");
		tvSeries.add("The Walking Dog");
		tvSeries.add("Prison Break");
		
		//we can apply iterator concept for any collection object hence it is universal cursor
		//By using iterator we can perform both read and remove operations
		System.out.println("Printing using iterator............");
		//1.using iterator
		Iterator<String> it = tvSeries.iterator();//tvSeries.iterator(); methods is there and it will simply return iterator of string
		//tvSeries is any collection of object
		
		//How will i iterate just simple use while loop
		
		while (it.hasNext()) {
			String shows=it.next();
		System.out.println(shows);	
		}
		
		System.out.println("\nusing for each loop--------------");
		// using for each loop
		for (String string : tvSeries) {
		System.out.println(string);			
		}
		
		System.out.println("\nusing for loop with order/index--------------");
		for (int i = 0; i < tvSeries.size(); i++) {
			System.out.println(tvSeries.get(i));
			
		}
		
		System.out.println("\nusing list iterator() to traverse in the back direction");
		ListIterator<String> myTvSeries=tvSeries.listIterator(tvSeries.size());
		while (myTvSeries.hasPrevious()) {
			String show = myTvSeries.previous();
			System.out.println(show);
			
		}
		
	}
	
		
		

}
