package stringConcept;

public class PracticeString {

	public static void main(String[] args) {

		String str1 = "javatpointtt";
		System.out.println("returning words:");
		String[] arr = str1.split("t", 0);
		for (String w : arr) {
			System.out.println(w);
			
		}
		System.out.println("Split array length: " + arr.length);

	}

}
