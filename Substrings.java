// Toru Hirano, lab section 6

import java.util.Scanner;

public class Substrings {

        public static void main(String[] args) {
                String substr, str;
                Scanner scan = new Scanner(System.in);

                System.out.println("Enter the substring: ");
                substr = scan.next();
                System.out.println("Enter the string: ");
                str = scan.next();

                String pos = countSubstring(str, substr);

                if (pos.equals(""))
                        System.out.println(substr + " is not found in " + str);
                else
                        System.out.println(substr + " is found in " + str + " at position(s) " + pos);
                scan.close();
        }

        static String countSubstring(String str, String substr) {
                int len1 = str.length();
                int len2 = substr.length();
                String pos = "";

                for (int i = 0; i <= len1 - len2; i++) {

                        // For current index i, check for pattern match
                        int j;
                        for (j = 0; j < len2; j++) {
                                if (str.charAt(i + j) != substr.charAt(j)) {
                                        break;
                                }
                        }

                        // if length of j is equal to substring length, than substring fount
                        if (j == len2) {
                                pos += String.valueOf(i) + " "; // its position is starting position of substring

                                j = 0; // again make j = 0
                        }
                }
                return pos;
        }
}
