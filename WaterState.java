//Toru Hirano, lab section 1

import java.util.Scanner;

public class WaterState {
	public static void main(String[]args) {
        
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a temperature value in Celcius or Fahrenheit : ");
		// note: please fill in the above blank like "100 f" or "70 c"
        

        String[] argv = in.nextLine().split(" ");

        int temp = Integer.parseInt(argv[0]);
        char tempType = argv[1].charAt(0);

        switch (tempType) {
            case 'c':
                if (temp <= 0) {
                    System.out.println("CELCIUS: Water is solid at " + temp);
                } else if (temp >= 100) {
                    System.out.println("CELCIUS: Water is gaseous at " + temp);
                } else {
                    System.out.println("CELCIUS: Water is liquid at " + temp);
                }
                break;

            case 'f':
                if (temp <= 32) {
                    System.out.println("FAHRENHEIT: Water is solid at " + temp);
                } else if (temp >= 212) {
                    System.out.println("FAHRENHEIT: Water is gaseous at " + temp);
                } else {
                    System.out.println("FAHRENHEIT: Water is liquid at " + temp);
                }
                break;
        }
    }
}