package p1;

public class NameException extends Exception {

	String firstName;
	String lastName;
	
	public NameException(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
		return "NameException [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	

}
