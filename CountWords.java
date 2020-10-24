// Toru Hirano, lab section 1

import java.util.Scanner;

public class CountWords {
	public static void main (String[] args) {
		// Required variables and scanner objects
		String str;
		@SuppressWarnings("resource")
		Scanner s = new Scanner (System.in);
		
		// Read a string from user
		System.out.print("enter a string:");
		str = s.nextLine();
		
		// Loops repeatedly until user enters done
		while(!str.equalsIgnoreCase("done")){
			
			// Calls and stores result from countWords method
			int numberOfWords = countWords(str);
			
			// Displays output
			System.out.println(" your string has " + numberOfWords + " words and " + str.length() + " chsracters ");
			
			// Read string again
			System.out.print(" enter a string: ");
			str = s.nextLine();
		}
	}
// Implementation of countWords
	public static int countWords (String str) {
		// Required variable to keep trucking of number
		int noOfWords = 0;
		
		// Loops string length
		for(int i = 0; i<(str.length()-1); i++) {
			
			// If the starting of the string is not a white space increments noOfWords
			if(i == 0 && str.charAt(0)!= ' ')
			  noOfWords++;
			
			// Check if any character is preceded by a whitespace
			if(str.charAt(i)== ' ' && str.charAt(i+1)!= ' ')
			  noOfWords++;
		}
		// Return number of words
		return noOfWords;
	}
}


