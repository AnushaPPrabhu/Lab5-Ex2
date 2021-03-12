package p1;

import java.util.Scanner;

public class Name {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first name");
		String firstName = sc.nextLine();
		System.out.println("Enter your Last Name");
		String lastName = sc.nextLine();
		

		
		boolean status = false;
		try {
			if(firstName.isBlank() || lastName.isBlank()) {
				status = false;
				throw new NameException(firstName, lastName);
			}
			else
			{
				status = true;
				System.out.println("Name is " + firstName + " " + lastName);
			}
		}
		catch(Exception ex){
			
			System.out.println(ex);
		}
	}// end main
}//end class