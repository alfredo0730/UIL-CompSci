import java.io.*;
import java.util.*;

public class Piano {
    public static void main(String args[]) throws IOException{
        Scanner f = new Scanner(new File("piano.dat"));

        int testCases = f.nextInt();
        int roadLength;
        String road;

        // First integer is the number of test cases so we store this to know how many times to run the program
        // Each test case gives you the road length and the road so we declare those variables
        // Since nextInt doesn't go to the next line, we have to use nextLine() to make sure we are on the right line
        // We store the roadLength and road to pass it to a method which tells us how many tiles we need

        for(int i = 0; i < testCases; i++){
            roadLength = f.nextInt();
            f.nextLine();
            road = f.nextLine();

            System.out.println(roadTiles(road, roadLength));
        }
    }

    // This method takes in the road and lengthOfRoad to find out how many tiles we need
    // The method declares roadState to figure out if there is a tile or a hole at a spot on the road
    // It also declares consecutiveHoles to count how many holes we see in a row and then tilesNeeded which is what we are trying to find
    // This method loops through every spot on the road by using a for loop dependant on the length of the road and sets roadState to the character at the spot i
    // The method finally returns the tilesNeeded

    public static int roadTiles(String road, int lengthOfRoad){
        char roadState;
        int consecutiveHoles = 0;
        int tilesNeeded = 0;

        for(int i = 0; i < lengthOfRoad; i++){
            roadState = road.charAt(i);

            // If the roadState is a hole, we add 1 to consecutiveHoles to keep count, it also checks if its the last roadState to update tilesNeeded
            // This was really important to update tilesNeeded as normally tilesNeeded is updated by finding a tile but if the last couple roadStates are holes, it won't get updated
            // If the roadState is not a hole, we add the amount of tiles we need to tilesNeeded to keep count and reset consecutiveHoles to 0

            if(roadState == '.'){
                consecutiveHoles++;
                if(i == lengthOfRoad - 1){
                    tilesNeeded += consecutiveHoles / 3;
                }
            }
            else{
                tilesNeeded += consecutiveHoles / 3;
                consecutiveHoles = 0;
            }
        }
        return tilesNeeded;
    }
}
