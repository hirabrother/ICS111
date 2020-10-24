// Toru Hirano, lab section 1

import java.util.Scanner;

    public class CircleDialog {
	    @SuppressWarnings("resource")
	    public static void main(String[] args) {
		    final double PI = 3.141592;
		    double radius;
		
		    Scanner scanner;
		    scanner = new Scanner(System.in);
		
		    System.out.println("Please input the radius of the circle:");
		    radius = scanner.nextDouble();
		
		    double circumference = 2 * PI * radius;
		
		    System.out.println(" A circle with the radius " + radius + " has the circumference " + circumference);
	}
}