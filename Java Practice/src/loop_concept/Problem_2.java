package loop_concept;

public class Problem_2 {

	public static void main(String[] args) {
		int i, j;
		
		for(i=1; i<=8; i++) {
			for(j=8; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
