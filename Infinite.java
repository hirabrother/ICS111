// Toru Hirano, lab section 1

public class Infinite{
    public static void selfmethod(){
        // call this method again to create a infinite recursion
        selfmethod();
    }
    
    // main driver code of the program
    public static void main(String args[]){
        // call the selfmethod() to create a infinite recursion
        selfmethod();
    }
}
