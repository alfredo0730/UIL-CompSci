import java.io.*;
import java.util.*;

public class Concerto {
    public static void main(String args[]) throws IOException{
        Scanner f = new Scanner(new File("concerto.dat"));

        int testCases = f.nextInt();
        f.nextLine();
        String sentance = "";

        // As always, our first integer tells us the number of test cases so we save that number to know how many times to run the program
        // Even though we used the nextInt() Scanner method, we are still on line 1 so we use the nextLine() method to make sure we are on line 2
        // We also declare our sentance variable as an empty string

        for(int i = 0; i < testCases; i++){
            sentance = f.nextLine();

            // We take the entire line as our sentance and then use the minorCounter5001 method to return true if it has more than two minors and false otherwise

            if(minorCounter5001(sentance)){
                System.out.println("It's over Vee Valdee! I have the high ground!");
            }
            else{
                System.out.println("You underestimate my music!");
            }
        }
    }

    // This method takes in the sentance and then finds the first instance of the word "minor". Since the indexOf method returns -1 if its not in the string, we check if its -1
    // As long as the indexOfMinor isn't -1, our while loop keeps checking for the next minor
    // When the indexOfMinor isn't 1, we add 1 to our minorCount and set restOfString to the string starting from 1 more than the index of "minor", so the start is now "inor"
    // This is to prevent the method from counting the same minor multiple times
    // Once the indexOfMinor is -1, we know that there is no more minors in the string so the while loop ends
    // Finally, the method checks if the minorCount is more than 2 and if it is, it returns true, otherwise it will return false

    public static boolean minorCounter5001(String sentance){
        String restOfString = sentance;
        int minorCount = 0;
        int indexOfMinor = 0;
        while(indexOfMinor != -1){
            indexOfMinor = restOfString.indexOf("minor");
            if(indexOfMinor != -1){
                restOfString = restOfString.substring(indexOfMinor + 1);
                minorCount += 1;
            }
        }
        if(minorCount > 2){
            return true;
        }
        return false;
    }
}
