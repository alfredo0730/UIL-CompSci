import java.io.*;
import java.util.*;

public class Forte {
    public static void main(String args[]) throws IOException{
        Scanner f = new Scanner(new File("forte.dat"));

        int testCases = f.nextInt();
        int dynamics;
        
        // The first integer in the file is always the number of testcases, so we save that value to know how many times to run the program
        // We declare our variable dynamics which is an integer which tells us the dynamic we are using

        for(int i = 0; i < testCases; i++){
            dynamics = f.nextInt();

            // The first if statement checks if our dynamics is less than 0, which means it is piano or soft
            // The corresponding else statement assumes our dynamics is greater than 0, which means it is forte or soft

            if(dynamics < 0){

                // The first level of piano is just piano while other levels are pianissimo with at least 1 "iss"
                // Since the level 1 is unique, we check if its level 1 piano with the if statement
                // The corresponding else statement checks how many "iss"s are needed for the dynamic using the isses() method

                if(dynamics == -1){
                    System.out.println("piano");
                }
                else{
                    System.out.println("pian" + isses(dynamics));
                }
            }
            else{

                // This section works the exact same as the piano section except its forte now

                if(dynamics == 1){
                    System.out.println("forte");
                    }
                else{
                    System.out.println("fort" + isses(dynamics));
                }
            }
        }
    }

    // This method checks how many isses are needed depending on the strength of the dynamic
    // For strength of 1, there is no iss, for strength 2, there is 1 iss, strength 3, there is 2 isses and so on
    // This is why our for loop starts at i = 1 rather than i = 0
    // The amount of isses does not depend on if the dynamics is negative or not so we take the absolute value
    // All dynamics with isses also end in imo so we add imo at the end and return the totalIsses

    public static String isses(int strength){
        String totalIsses = "";
        int magnitude = Math.abs(strength);
        for(int i = 1; i < magnitude; i++){
            totalIsses += "iss";
        }
        totalIsses += "imo";
        return totalIsses;
    }
}
