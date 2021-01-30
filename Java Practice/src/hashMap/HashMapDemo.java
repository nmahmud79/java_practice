package hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

//HashMap is a class implements Map interface.
//extends AbstractMap
//A map store values on the basis of key, i.e. key and value pair. 
//Each key and value pair is known as an entry. 
//A Map contains unique keys.
//HashMap stores two objects key and value.
//HashMap doesn't allow duplicates key
//it may have one null key and multiple null value
//it maintains no order.
//hashMap is non-synchronized---not thread safe
//concurrent modification exception---Fail Fast condition
//when one thread is adding or removing the value and at the same time T2 T3 T4
//try to access particular value but that value is gone from that object
//immediately it gives you..cme.

public class HashMapDemo {

	public static void main(String[] args) {
	
		  //This is how to declare HashMap
	      HashMap<Integer, String> hmap = new HashMap<Integer, String>();

	      //Adding elements to HashMap
	      hmap.put(1, "Chaitanya");
	      hmap.put(2, "Rahul");
	      hmap.put(3, "Singh");
	      hmap.put(4, "Ajeet");
	      hmap.put(5, "Anuj");
	     
	      //System.out.println(hmap);
	      System.out.println(hmap.get(1));
	      System.out.println(hmap.get(2));
	      System.out.println(hmap.get(3));
	      System.out.println(hmap.get(4));
	      System.out.println(hmap.get(5));
	      
	      for (Entry m: hmap.entrySet()) {
	    	  System.out.println(m.getKey()+" "+m.getValue());
	      }
	      //remove element
	      System.out.println(hmap.remove(3));
	    
	
	}

}
