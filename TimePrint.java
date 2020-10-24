// Toru Hirano, lab section 1

import java. util.Scanner;

public class TimePrint {
    @SuppressWarnings({ "resource", "unused" })
	public static void main(String[]args){
    Scanner in = new Scanner (System.in);
    System.out.println("Enter the number of minutes: ");
    long userinput = in.nextLong();
    long hours = userinput / 60;
    long minutes = userinput % 60;
    String yournumber = "you entered: ";
    
    // prints number out of range if user input
	if ((userinput <= 0) || (userinput > 1440)) {
		System.out.println ("number is out of range");
	}
	
	// how can I make it correctly to print it only hours
	else if (hours == 1) {
		String hoursone = (hours == 1) ? hours + " hour " : hours + " hours";
		System.out.println (yournumber + hoursone);
	}
	
	//Prints hours and minutes
	else if (userinput >= 60) {
		String hourone = (hours == 1) ? hours + " hour " : hours + " hours ";
		String minuteone = (minutes == 1) ? minutes + " minute" : minutes + " minutes ";
		System.out.println (yournumber + hourone + minuteone);
	}
	
	//Print just the minutes
	else if (userinput < 60) {
		String minuteone = (minutes == 0) ? minutes + " minute " : minutes + " minutes ";
		System.out.println (yournumber + minuteone);
	}
     }
}
	