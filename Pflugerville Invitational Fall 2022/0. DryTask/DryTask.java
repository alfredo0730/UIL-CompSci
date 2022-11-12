import java.io.*;
import java.util.*;

public class  DryTask{
    public static void main(String args[]) throws IOException{
        Scanner f = new Scanner(new File("DryTask.bat"));
        int n = f.nextInt();
        f.nextLine();
        for(int i = 0; i < n; i++){
            System.out.println("I like " + f.nextLine());
        }
    }
    
}
