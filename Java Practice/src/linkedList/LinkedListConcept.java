package linkedList;

import java.util.Iterator;
import java.util.LinkedList;

//Linked List is a class which is implementing list interface also deque interface
//Each and every node is divided into two parts
//1st part store the value and 2nd part stores the reference of the next element 
//each and every node has reference of next element thats why its called singly linked list 
//if there is a requirement of frequent addition and deletion in application then LinkedList is a best choice.

public class LinkedListConcept {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();	
		
		//add:
		ll.add("test");
		ll.add("QTP");
		ll.add("Selenium");
		ll.add("RPA");
		ll.add("RFT");
		
		//print:
		System.out.println("content of linked list :"+ ll);
		
		//add first
		ll.addFirst("Mahmud");
		//add last
		ll.addLast("Automation");
		System.out.println("content of linked list :"+ ll);
		//get:
		System.out.println(ll.get(0));
		
		//set:
		ll.set(0, "Nurul");
		System.out.println(ll.get(0));
		
		//remover first and last
		ll.removeFirst();
		ll.removeLast();
		System.out.println("content of linked list :"+ ll);
		
		//for loop:
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}
		System.out.println("************advance for loop***********");
		for (String string : ll) {
		System.out.println(string);
		}
		
		
		System.out.println("************iterator***********");
		Iterator<String> it = ll.iterator();
		while (it.hasNext()) {
		System.out.println(it.next());
		}
		
		System.out.println("************while***********");
		int num=0;
		while (ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
			
		}
	}

}
