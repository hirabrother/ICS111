// Toru Hirano, lab section 1

import java.util.Scanner;

	public class SquareScanner {
		@SuppressWarnings("resource")
		public static void main(String[] args) {

			Scanner scanner; 
            scanner = new Scanner(System.in);

			System.out.print("Enter a side:");
			double length = scanner.nextDouble();

			double diagonal = Math.sqrt(2) * length;
			
			System.out.println(" A square with side " + length + " has a diagonal of length " + diagonal);

		}
	}
