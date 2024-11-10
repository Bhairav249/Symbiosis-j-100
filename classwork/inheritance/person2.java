package hasAInheritance;

public class person2 {

	private String name;

	public String getName() {
		this.name =name;
	}
}

class Address1{
	private String state;
	private String city;
	private String zip;
	public String getState() {
	return state;
}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public void setState(String state) {
		this.state = state;
	}
}

public class BidirectManytoMany() {
	
	public static void main(String []args) {
		person2.setName("Bhairva");
		
		Address1 add = new Address1();
		addr.setCity("Nashik");
		addr.setState("Maharashtra");
		addr.setZip("422009");
		
		
		System.out.println("Person name: "+ p1.getName()
		+"City1:" +addr.getCity()
		+"STATE:" +addr.getState()
		+"ZIP:" +addr.getzip()
		
		
	}
}
