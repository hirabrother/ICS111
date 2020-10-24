// Toru Hirano, lab section 1

import java. util.Scanner; 

public class Alphabetize {
	public static String[] sort(String[] asd) {
	    String[] sorted = asd.clone();
	    for (int i = 0; i < sorted.length; i++) {
	        for (int j = i + 1; j < sorted.length; j++) {
	            int compare = sorted[i].compareTo(sorted[j]);
	            if ((compare > 0) && (i != j)) {
	                //compare two strings
	                String temp = sorted[j];
	                sorted[j] = sorted[i];
	                sorted[i] = temp;
	            }
	        }
	    }
	    return sorted;
	}
	public static void main(String[] args) {
	    @SuppressWarnings("resource")
		Scanner scan1 = new Scanner(System.in);
	    String firststring, secondstring, thirdstring;
	    System.out.println("first string: ");
	    firststring = scan1.next();
	    System.out.println("second string: ");
	    secondstring = scan1.next();
	    System.out.println("third string: ");
	    thirdstring = scan1.next();
	    String array[] = {firststring, secondstring, thirdstring};
	    //set array equal to the inputs
	    String[] sortedArray = sort(array);
	    for (int i = 0; i < sortedArray.length; i++) {
	        if (i == sortedArray.length - 1) {
	            System.out.println(sortedArray[i]);
	        } else {
	            System.out.print(sortedArray[i] + ",");
	        }
	    }
	}
	}