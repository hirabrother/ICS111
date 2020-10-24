// Toru Hirano, lab section 1

import java.util.Scanner;
import java.io.*;

public class OnesZerosA{
    public static void main(String args[]) throws Exception
    {
        if(args.length==0)
        {
            System.out.println(" File namehas not provided ");
            return;
        }
        Scanner input=new Scanner (new File(args[0]));
        String first_line=input.nextLine();
        boolean valid=OneZerosA(first_line);
        
        int length=first_line.length();
        int rows=1;
        while(input.hasNext())
        {
            String line=input.nextLine();
            if (line.length()!=length||! OneZerosA(line))
            {
                valid=false;
                break;
            }
            rows++;
            }
        
        if (rows!=length ||! valid)
        {
            System.out.println(" Something is wrong in file ");
            return;
        }
        input.close();
        
        input=new Scanner(new File(args[0]));
        while(input.hasNext())
        {
            System.out.println(input.nextLine());
        }
        input.close();
    }
    public static boolean OneZerosA(String str)
    {
        for(int i=0;i<str.length();i++)
            {
            char ʻ0ʻ = 0;
			char ʻ1ʻ = 0;
			if (!(str.charAt(i)==ʻ0ʻ||str.charAt(i)==ʻ1ʻ))
                return false;
        }
        return true;
    }
}


