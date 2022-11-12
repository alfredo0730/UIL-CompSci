import java.io.*;
import java.util.*;

public class Pitch {
    public static void main(String args[]) throws IOException{
        Scanner f = new Scanner(new File("pitch.dat"));

        int testCases = f.nextInt();
        f.nextLine();
        String wrongPitch = "";

        // First int is the number of test cases, save it and use to run the program that many times (This is a trend across all problems pretty much)
        // Since nextInt() doesn't go to the next line, we have to do that with nextLine() to start on the correct line

        for(int i = 0; i < testCases; i++){
            wrongPitch = f.nextLine();

            // We save the line which is our pitch to wrongPitch and then check which pitch it is and then correct it accordingly
            // We use a switch statement to check what case we are looking at, is it the case where our wrongPitch is "A Flat" etc and then corrects when it matches that case
            // If statements could work too but using switch makes it easier and shorter for this situation

            switch (wrongPitch){
                case "A Flat":
                System.out.println("G Sharp");
                break;
                case "B Flat":
                System.out.println("A Sharp");
                break;
                case "C Flat":
                System.out.println("B Sharp");
                break;
                case "D Flat":
                System.out.println("C Sharp");
                break;
                case "E Flat":
                System.out.println("D Sharp");
                break;
                case "A Sharp":
                System.out.println("B Flat");
                break;
                case "B Sharp":
                System.out.println("C Flat");
                break;
                case "C Sharp":
                System.out.println("D Flat");
                break;
                case "D Sharp":
                System.out.println("E Flat");
                break;
                case "E Sharp":
                System.out.println("F Flat");
                break;
            }
        }
    }
}
