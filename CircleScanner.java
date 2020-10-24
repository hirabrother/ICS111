// Toru Hirano, lab section 1

import java.util.Scanner;

	public class CircleScanner {
	    @SuppressWarnings("resource")
	    public static void main(String[] args) {
		    final double PI = 3.141592;
		    double radius;
		
		    Scanner scanner;
		    scanner = new Scanner(System.in);
		
		    System.out.println("Enter a radius:");
		    radius = scanner.nextDouble();
		
		    double circumference = 2 * PI * radius;
		
		    System.out.println(" A circle with radius " + radius + " has circumference " + circumference);
	}
}