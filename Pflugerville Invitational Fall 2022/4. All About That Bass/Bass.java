import java.io.*;
import java.util.*;

public class Bass {
    public static void main(String args[]) throws IOException{
        Scanner f = new Scanner(new File("Bass.dat"));

        int testCases = f.nextInt();
        double Appreciation;
        int N, q, T;

        // The first integer in the file tells us how many test cases the file has, we store this as testCases to remember how many times to run the program
        // We then declare Appreciation as a double since the methods we need to use in the Math class return a double
        // We also declare our variables N, q, and T
        // The test cases are formatted such that N comes first, then q, and finally T

        for(int i = 0; i < testCases; i++){
            N = f.nextInt();
            q = f.nextInt();
            T = f.nextInt();

            // We assign the values of the integers in the order we are given them and then just abuse the Math class

            Appreciation = ((q * (Math.log(N)/Math.log(2)))/(Math.sqrt(Math.abs(42 * Math.sin(T)))));

            // Because this line is somewhat hard to read, here is what the numerator and denominator are:
            // Numerator: (q * (Math.log(N)/Math.log(2)) use properties of logarithms to rewrite the numerator
            // Denominator: (Math.sqrt(Math.abs(42 * Math.sin(T))))

            Appreciation = Math.round(Appreciation * 100.0) / 100.0;

            // Math.round rounds to the nearest integer, but if we want to round to 2 decimal places, we multiply by 100 and round, and then we divide by 100.0
            // It's important to divide by 100.0 not 100 because Math.round returns an int type so int / int deletes our decimals 

            System.out.println(Appreciation);
        }
    }
}
