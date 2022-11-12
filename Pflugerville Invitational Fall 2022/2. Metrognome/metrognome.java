import java.io.*;
import java.util.*;

public class metrognome {
    public static void main(String args[])throws IOException{
        Scanner f = new Scanner(new File("metrognome.dat"));

        int testCases = f.nextInt();
        int lcm = 1;
        int numberOfNums, currentNum;

        // The first integer in the file tells us how many test cases the file has, we store this as testCases to remember how many times to run the program
        // We then set our lcm to 1 as that is the smallest lcm possible and declare our numberOfNums and currentNum variables
        // The variable numberOfNums tells us how many numbers we have to take the lcm of, while currentNum represents the current number we are comparing our lcm to
        // The test cases are formatted with the amount of numbers we have to take the lcm of first, then the actual values of those numbers

        for(int i = 0; i < testCases; i++){
            numberOfNums = f.nextInt();

            // The lcm of 3 numbers is just the lcm of the lcm of the first to and the third, or lcm(a, b, c) = lcm(lcm(a, b), c)
            // This allows us to apply recursion in a straigth foward manner by just starting with an lcm of 1, and doing lcm = lcm(currentNum, lcm) 

            for(int j = 0; j < numberOfNums; j++){
                currentNum = f.nextInt();
                lcm = lcm(currentNum, lcm);
            }

            System.out.println(lcm); 

            // We reset the values of lcm, currentNum, and numberOfNums to their default values to be able to do the next test case with no interferance from other programs
            
            lcm = 1;
            currentNum = 0;
            numberOfNums = 0;
        }
    }

    // This method takes the current lcm and checks if its divisible by both num1 and num2. If not, it will add 1 to the lcm
    // If the lcm is divisible by both, then it will break out of the while loop and return the final lcm

    public static int lcm(int num1, int num2){
        int lcm = num1;
        while(!((lcm % num1) == 0 && (lcm % num2) == 0)){ // while it is NOT true that the lcm is divisible by num1 AND divisible bynum2, add 1
            lcm++;
        }
        return lcm;
    }
}
