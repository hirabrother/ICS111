// Hirano Toru, lab section 1

import java.util.Scanner;

	public class SquareDialog {
		@SuppressWarnings("resource")
		public static void main(String[] args) {

			Scanner scanner; 
            scanner = new Scanner(System.in);

			System.out.print("Please input the length of the side:");
			double length = scanner.nextDouble();

			double diagonal = Math.sqrt(2) * length;
			
			System.out.println(" A square with the side " + length + " has the diagonal of length " + diagonal);

		}
	}
