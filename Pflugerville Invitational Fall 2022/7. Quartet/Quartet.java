import java.io.*;
import java.util.*;

public class Quartet {
    public static void main(String args[]) throws IOException{
        Scanner f = new Scanner(new File("quartet.dat"));

        int testCases = f.nextInt();
        int numViolins, numViolas, numCellos, numBass, totalSkill;

        // Like usual, the first integer tells us the amount of test cases so we store that value to know how many times to run the program
        // We declare all of our variables, the number of each instrument and the total skill of the quartet
        // Since the number of instruments come in order of violin, viola, cello, and basss, we have to store the values in that order

        for(int i = 0; i < testCases; i++){
            numViolins = f.nextInt();
            numViolas = f.nextInt();
            numCellos = f.nextInt();
            numBass = f.nextInt();

            // We store the values of the number of instruments, and then use a method to find the best musician out of each group
            // We directly assign the best violinist's skill to the total skill so that for every test case, the total skill will be reset to the correct amount
            // For every other instrument, we just add the skill of the best musician to the total
            
            totalSkill = bestMusician(numViolins, f);
            totalSkill += bestMusician(numViolas, f);
            totalSkill += bestMusician(numCellos, f);
            totalSkill += bestMusician(numBass, f);

            System.out.println(totalSkill);
        }
    }

    // This method takes in two parameters: numberOfInstruments and the file. We need to take the file as well otherwise the method won't be able to search through it
    // This method keeps the skill of the current musician and then compares it to the best, which the best starts at 0
    // If it finds a musician better than the current highest skill, it sets the highest skill to that musician's skill
    // Once it checks every musician for that instrument, it returns the highest skill for that instrument

    public static int bestMusician(int numberOfMusicians, Scanner f){
        int highestSkill = 0;
        int currentSkill = 0;
        for(int j = 0; j < numberOfMusicians; j++){
            currentSkill = f.nextInt();
            if(highestSkill < currentSkill){
                highestSkill = currentSkill;
            }
        }
        return highestSkill;
    }
}
