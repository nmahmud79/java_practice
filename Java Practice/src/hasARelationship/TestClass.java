package hasARelationship;

//technolozies kart
public class TestClass {

	public static void main(String[] args) {
		Address add = new Address("USA");
		Customer customer = new Customer(add);
		System.out.println(customer.getAddress().getCountry());

	}

}
