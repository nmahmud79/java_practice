package this_keyword_concept;

	//Real usage of this() constructor call
	//The this() constructor call should be used to reuse the constructor from the constructor. 
	//It maintains the chain between the constructors i.e. it is used for constructor chaining.
	//>>Let's see the example given below that displays the actual use of this keyword.
	public class Student {
		
		int rollno;  
		String name,course;  
		float fee;  
		Student(int rollno,String name,String course){  
		this.rollno=rollno;  
		this.name=name;  
		this.course=course;  
		}  
		Student(int rollno,String name,String course,float fee){  
		this(rollno,name,course);//reusing constructor  
		this.fee=fee;  
		}  
		void display(){
			System.out.println(rollno+" "+name+" "+course+" "+fee);
			}  
}  

