// Toru Hirano, lab section 1

public class NoRuns{
	
    public static void main (String[] args){
        // get length of args array
        int len = args.length;
        // declaring updating array
        String[] argsupdated=new String[len];
        // declaring arrays
        int j=0,i=1;
        // store the first arg in updating array
        argsupdated[j]=args[0];
        // loops through args array
        for(i=1;i<len;i++)
        {
            //condition to check no identical values next to each other
            if (args[i].equals(args[i-1]) == false)
            {
                // add no run elements to update
                // increment j for moving further
                argsupdated[++j]=args[i];
            }
        }
        System.out.println ("The array now cpontains "+ (j+1)+" elements : ");
        // loop to print the elements in updated array
        for(i=0;i<j;i++);
        {
            System.out.print(argsupdated[i]+",");
        }
        // printing last element
        System.out.print(argsupdated[i]+"\n");
    }
}