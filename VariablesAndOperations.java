package week1VaraiblesAndOperations;

public class VariablesAndOperations {

	public static void main(String[] args) {
		// declare variables
		int seatsRemaining = 8;
		double costOfGroceries = 25.32;
		char middleInitial ='C';
		boolean isHotOutside = false;
		String firstName = "Richard", custAddress = "123 Anywhere St";
		
		/* NOTES: all vars should be printed to console
			customer booked 2 seats, remove 2 seats from available seats var
			impulse candy bar purchase. add 2.15 to grocery total
			birth cert printed incorrectly, change middle inital to something else
			season has changed, update hot var to opposite */
		
		// Print default values of variables
		System.out.println("DEFAULT VALUES");
		System.out.println("Available seats left on the plane: "+ seatsRemaining);
		System.out.println(costOfGroceries + " is the price for groceries.");
		System.out.println("The person's middile initial is "+ middleInitial);
		System.out.println("It is hot outside = "+ isHotOutside);
		System.out.println("The customer's first name is " + firstName);
		System.out.println(custAddress + " is where the person lives.");
		
		//Deduct seats
		//seatsRemaining = seatsRemaining-2;
		seatsRemaining -= 2;
		costOfGroceries += 2.15;
		middleInitial = 'M';
		isHotOutside = !isHotOutside;
		
		// Print changed values of variables
		System.out.println("\nNEW VALUES");
		System.out.println("Available seats left on the plane: "+ seatsRemaining);
		System.out.println(costOfGroceries + " is the price for groceries.");
		System.out.println("The person's middile initial is "+ middleInitial);
		System.out.println("It is hot outside = "+ isHotOutside);
		
		String fullName = firstName + " " + middleInitial + " Smith."; 		
		System.out.println("\nHi my name is " + fullName + " and i live at "+ custAddress);
		
	}

}
