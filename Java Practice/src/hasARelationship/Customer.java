package hasARelationship;

public class Customer {
	
	Address address;
	
	public Customer(Address address) {
		this.address=address;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address=address;
	}

}
