import java.util.Scanner;

// Toru Hirano, lab section 1

public class RentalRelief {
	
public static void main(String[]args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Please input a household size and income level : ");
	
	 String[] argv = in.nextLine().split(" ");

     int household = Integer.parseInt(argv[0]);
     char income = argv[1].charAt(0);
     
             if (household < 0) {
                 System.out.println(" A " + household + "-person with income of " + income + " is elihible for rental relief" );
             } else if (household > 10) {
                 System.out.println(" A " + household + "-person with income of " + income + " is not eligible for rental relief" );
             } else {
            	 
            if (income > 113400) {
// I am sorry, but I have no idea how to write below. 
            }
            	 
           
     }
     }
}
