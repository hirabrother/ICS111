// Toru Hirano, lab section 1

import java.util.Scanner;
public class PrintHex{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // input integer number
        int number;
        do{
            // ask user to enter a number
            System.out.print("enter a number: ");
            number = sc.nextInt();
            // call intToHex method and store results in hexValue
            String hexValue = intToHex(number);
            // print the  hexValue
            System.out.println(hexValue);
        } while (number >= 0);
        // continue until user input negative number
        sc.close();
    }
    
    // method to convert integer to hexDecimal value
    public static String intToHex(int number){
        // create stringBuilder object to store hexadecimal value
        StringBuilder builder = new StringBuilder();
        // if number larger than 0
        if (number > 0){
            // recursively call the intToHex method
            String hexNumber = intToHex(number / 16);
            // hexCode is digits in HexDecimal representation
            String hexCode = "0123456789ABCDEF";
            // get the current digits from number
            int hexDigit = number % 16;
            // append the character present at hexGigit in hexCode
            builder.append(hexNumber + hexCode.charAt(hexDigit));
        }
        // return builder by converting into String
        return builder.toString();
    }
}

