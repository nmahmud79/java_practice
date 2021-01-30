package casting_object_demo;

public class Test {

	public static void main(String[] args) {
		Person p = new Teacher(); //create sub class object and put it in super class and its called upcasting & its automatically done
		p.display();//by upcasting, we can put subclass object in super class
		
		Teacher t = (Teacher)new Person();//we can't put super class object in sub class. here we want to put large things in small things
		t.display();//downcasting is not possible, it will give ClassCastException

	}

}
   