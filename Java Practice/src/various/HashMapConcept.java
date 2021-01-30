package various;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {
		
		//Java HashMap Class contains only unique keys
		//Java HashMap Class is maintains no order 
		//Java HashMap Class is non synchronized
		//Arrays store items as an ordered collection, and you have to access them with an index number (int type). 
		//A HashMap however, store items in "key/value" pairs, and you can access them by an index of another type (e.g. a String).
		//One object is used as a key (index) to another object (value). 
		//It can store different types: String keys and Integer values, or the same type, like: String keys and String values:
		//Create a HashMap object called hmap that will store String keys and String values:
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		
		//add key and values
		hmap.put(101, "Nurul");
		hmap.put(102, "Mahmud");
		hmap.put(103, "Sulov");
		hmap.put(104, "Rony");
		hmap.put(105, "Zea");
		System.out.println(hmap);
		
		//For Loop
		System.out.println("For Loop");
		
		for (Map.Entry mapElement : hmap.entrySet()) {
			//int key =(int) mapElement.getKey();
			//String value =(String) mapElement.getValue();
			//System.out.println(key+value);
			System.out.println("key :"+mapElement.getKey()+"& value :"+mapElement.getValue());
		}
		
		System.out.println("WHILE LOOP");
		
		//Iterator iterator = std.entrySet().iterator();
		
		//while (iterator.hasNext()) {
			//Map.Entry mapElement2 = (Map.Entry) iterator.next();
			//System.out.println(mapElement2.getKey()+mapElement2.getValue());
		}
	}
		
	
	


