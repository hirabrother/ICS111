// Toru Hirano, lab section 6

import java.util.*;
public class AllSubstrings{
  public static void main (String[] args) {
	  
    // scanner class for new input
    @SuppressWarnings("resource")
	Scanner input = new Scanner (System.in);
    
    // string initialization
    String str = "";
    
    // while loop for continuous execution using true
    while (true){
        System.out.print ( " Enter a string: " );        
        // user input
        str = input.nextLine();
        
        // string comparison to check if string equals to "done", if so, it exists from continuous loop using break statement
        if ((str.equals("done"))){
            break;
        }
        // methods to print substrings
        printSubstrings(str);
        
        // to print "Enter a string" in the next line 
        System.out.println();
    }
}
  public static void printSubstrings (String str){
    System.out.print ( " The substrings of \""+str+"\" are " );
    
    // using for loop we retrieve the words from 1st char to last char in string 
    for (int i = 0; i<str.length(); i++){
    	
        // nested for loop will help to retrieve the substrings within the range of its element
        for (int j = 0; j<str.length()-i; j++){
        	
            // substring method will help to retrieve substrings
            System.out.print ( " \""+str.substring (i, str.length()-j)+"\"" );
            // printing "," to last word, for last word we should not be print ","
            
            if (i !=str.length()-1){
                System.out.print ( "," );
            }
       }
    }
  }
}