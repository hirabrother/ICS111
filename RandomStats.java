// Toru Hirano, lab section 1

import java.util.Random;
public class RandomStats implements ComputingInterface{
    public static void main(String[] args){
        
        RandomStats rs = new RandomStats();
        double a[] = rs.generateRandom();
        rs.statistics(a);
    }
    
    // generates 1000 random numbers
    public double [] generateRandom(){
        
        int size = 1000;
        double[] a = new double[size];
        Random rand = new Random();
        // nextDouble generates random numbers from 0 to 1
        for(int i=0; i<size; i++){
            a[i] = rand.nextDouble();
        }
        return a;
    }
    
    // this method computes and prints mean, min, max
    public void statistics(double[] a){
        double sum = 0;
        
        // min value is declared with max value
        double minimum = Integer.MAX_VALUE;
        // max value is declared with min value
        double maximum = Integer.MIN_VALUE;
        
        for (double x : a) {
            if (x < minimum){
                minimum = x;
            }
            if (x > maximum){
                maximum = x;
            }
            sum +=x;
        }
        // avarage = sum / size
        double mean = sum/a.length;
        
        // prints min, max, and mean value
        System.out.println ("Manimum \t: "+minimum);
        System.out.println ("Maximum \t: "+maximum);
        System.out.println ("Mean \t\t: "+mean);
    }
}

