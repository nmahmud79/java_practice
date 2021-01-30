package continue_concept;

		//Java Continue Statement in while loop
public class Continue_Demo_2 {

	public static void main(String[] args) {
		
		int i=1;  
	    while(i<=10){  
	        if(i==5){  
	            //using continue statement  
	            i++;  
	            continue;//it will skip the rest statement  
	        }  
	        System.out.println(i);  
	        i++;  
	    }  

	}

}
