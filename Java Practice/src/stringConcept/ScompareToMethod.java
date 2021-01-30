package stringConcept;

public class ScompareToMethod {
	
	//if s1 > s2, it returns positive number  
	//if s1 < s2, it returns negative number  
	//if s1 == s2, it returns 0  

	public static void main(String[] args) {
		   String s1="Sachin";  
		   String s2="Sachin";  
		   String s3="Ratan";  
		   System.out.println(s1.compareTo(s2));//0  
		   System.out.println(s1.compareTo(s3));//1(because s1>s3)  
		   System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )  
		   
		   String a1 = "Mahmud";
		   String a2 = "Mahmud";
		   String a3 = new String("Mahmud");
		   System.out.println(a1==a2);
		   System.out.println(a1==a3);
	}
} 
