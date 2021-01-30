package ArrayList;

import java.util.ArrayList;

//Arraylist---dynamic array---we don't define the size.
//The ArrayList class implements the List interface. 
//It uses a dynamic array to store the duplicate element of different data types. 
//The ArrayList class maintains the insertion order and is non synchronized. 
//Allows random access to fetch the element because it store values on the basis of indexes. 
//only store one object.
//Arraylist allows you to remove elements, but array doesn't provide such methods.

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		ArrayList<String> aList = new ArrayList<String>();
		
		//add elements to an ArrayList by using add() method
		
		System.out.println("Arraylist before removing :");
		aList.add("A");//0
		aList.add("B");//1
		aList.add("B");//2---add duplicate elements or it can contain duplicate value/index
		aList.add("C");//3
		aList.add("D");//4
		aList.add("E");//5
		aList.add(4, "F");//add elements at 4th position
		
		//dispalying the elements
		System.out.println(aList);
		System.out.println("value at 2nd index :"+aList.get(2));
		System.out.println("size of the array before removing: "+aList.size());
		
		System.out.println("Arraylist after removing :");
		
		aList.remove(2);//removing 3rd element
		aList.remove("E");//remove E
		System.out.println(aList);
		System.out.println("size of the array after removing: "+aList.size());
		
		System.out.println("using for loop:");
		//to print all the values from array list: 
		//1.for loop
		//2.iterator
		for (int i = 0; i < aList.size(); i++) {
			System.out.print(aList.get(i));
		}
		
		
	}

}
