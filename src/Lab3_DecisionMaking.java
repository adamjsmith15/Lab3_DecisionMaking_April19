import java.util.Scanner;

public class Lab3_DecisionMaking {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		//declare variable
		int userInput;
		String name;
		char keepPlaying;
		System.out.println("Please enter your name");
		name = scnr.next();
		
	
		do {
			//re assign userInput and keepPlaying for while loops
			userInput = -1;
			keepPlaying = 'i';
			while (userInput < 1 || userInput > 100) {
				System.out.println(name + ", please enter a number between 1 and 100: ");
				userInput = scnr.nextInt();
			}
			if (userInput % 2 != 0 && userInput > 60) {
				System.out.println(userInput + " and Odd and over 60");
			} else if (userInput % 2 != 0) {
				System.out.println(userInput + " and Odd");

			} else if (userInput % 2 == 0 && userInput < 25) {
				System.out.println("Even and less than 25");

			} else if (userInput % 2 == 0 && userInput <= 60) {
				System.out.println("Even");

			} else if (userInput % 2 == 0 && userInput > 60) {
				System.out.println(userInput + " and Even");

			} else {
				System.out.println("An error occured");
			}
			// check to see if player is entering a valid y or n response
			while(keepPlaying != 'n' && keepPlaying != 'y') {
				System.out.println("Would you like to continue, " + name + "? (y/n): ");
				String tempKeepPlaying = scnr.next();
				tempKeepPlaying = tempKeepPlaying.toLowerCase();
				keepPlaying = tempKeepPlaying.charAt(0);
				//System.out.println(keepPlaying);
			}
		} while (keepPlaying != 'n');

		System.out.println("Goodbye " + name + "!");
		
		//this is the end of the program
		scnr.close();
	}
	
}
