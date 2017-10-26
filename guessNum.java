import java.util.Scanner;

public class guessNum {

	public static void main(String[] args) {
		
		// Computer generates a random number between 1 and 100
		int upperBound = 100;
		int lowerBound = 1;
		int generatedNum = (int) ( Math.random()*upperBound - lowerBound ) + lowerBound;
		
		// Create Scanner Object
		Scanner read = new Scanner(System.in);
		
		// Prompt the user to enter a number
		System.out.print( "I'm thinking of a number. Guess a value (1-100): ");
		
		// Check if user entry is valid
		
		
		// Valid: (+1 tries) compare user entry to computer generated number
		
		// Correct guess: output number of tries
	}

}
