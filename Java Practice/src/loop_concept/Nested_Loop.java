package loop_concept;

public class Nested_Loop {

	public static void main(String[] args) {
	int i, j;
		 
	for(i=1; i<=2; i++) {//2 times
	System.out.println("outer loop start");
	
	for(j=1; j<=3; j++) {//3 times
		System.out.println("*****inner loop start****");
		}
	System.out.println("outer loop end");
	System.out.println("\n");
	}
}
}
