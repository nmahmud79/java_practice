package loop_concept;

public class For_Each_Loop {
	//Java for-each Loop/enhanced for loop
	//The for-each loop is used to traverse array or collection in java. It is easier to use than simple for loop because we don't need to increment value and use subscript notation.
	//It works on elements basis not index. It returns element one by one in the defined variable.
	
	public static void main(String[] args) {
		//Declaring an array 
		int [] a= {12, 15, 8, 10, 43};
		//Printing array using for-each loop  
		for (int i : a) {
			System.out.println(i);
		}
	}

}
