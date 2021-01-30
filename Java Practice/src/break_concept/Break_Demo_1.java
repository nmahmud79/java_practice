package break_concept;

		//Java Break Statement with Inner Loop
		//It breaks inner loop only if you use break statement inside the inner loop.
		//Need to understand clearly
public class Break_Demo_1 {

	public static void main(String[] args) {
		
		//outer loop
		for(int i=1; i<=3; i++) {
			//inner loop
			for (int j = 1; j <=3; j++) {
				if (i==2&&j==2) {
				//using break statement inside the inner loop 
					break;
				}
				System.out.println(i+" "+j);
			}
		}
	}

}
