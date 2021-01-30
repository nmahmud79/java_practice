package polymorphismConcept;

public class TestClass {

	public static void main(String[] args) {
		Animal myAnimal = new Animal();//Create animal object
		Animal myAnimal2 = new Pig();//create Pig object
		Animal myAnimal3 = new Dog();//create Dog object
		
		myAnimal.animalSound();
		myAnimal2.animalSound();
		myAnimal3.animalSound();

	}

}
