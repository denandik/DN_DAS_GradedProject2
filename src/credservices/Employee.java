package credservices;

public class Employee {
	
	private String pFirstName;
	private String pLastName;
	
	public Employee(String firstName,String lastName) {
		pFirstName = firstName;
		pLastName = lastName;
	}

	public String getFirstName() {
		return pFirstName;
	}

	public String getLastName() {
		return pLastName;
	}

}
