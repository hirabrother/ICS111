// Toru Hirano, lab section 1

import java.util.Scanner;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class OnesZerosAL {
	public static void main (String args[]) {
		if(0<args.length) {
			String filename = args[0];
			try {
				File myObj = new File(filename);
				@SuppressWarnings("resource")
				Scanner fileobj = new Scanner(myObj);
				
				int len = 0;
				
				ArrayList<ArrayList<Integer> > datafromfile = new ArrayList<ArrayList<Integer> >();
				int k = 0;
				
				while(fileobj.hasNextLine()) {
					String data = fileobj.nextLine();
					datafromfile.add(new ArrayList<Integer>());
					
					if(len == 0) len = data.length();
					else {
						if(len!=data.length()) {
							return;
						}
					}
					for(int i=0; i<data.length(); i++) {
						if(data.charAt(i)!= '0' || data.charAt(i)!='1'){
							return;
						}else {
							datafromfile.get(k).add(i,(int)data.charAt(i));
						}
					}
					k++;
				}
				fileobj.close();
				for(int i=0; i<datafromfile.size(); i++) {
				for(int j=0; j<datafromfile.get(i).size(); j++) {
				System.out.println(datafromfile.get(i).get(j));
			}
			System.out.println();
		}}
	catch (FileNotFoundException e) {
		System.out.println(" An error occured. ");
		e.printStackTrace();
	}
}
else {
	return;
        }
	}
}
