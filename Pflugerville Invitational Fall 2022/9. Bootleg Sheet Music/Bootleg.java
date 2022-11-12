import java.io.*;
import java.util.*;

// For this one, we didn't have an input or anything too complicated so we didn't need to import java.util.*
// It is fine to import it though as it doesn't affect anything but VS Code will underline it to tell us that its never used

public class Bootleg {
    public static void main(String args[]) throws IOException{

        // For this one, all we needed to do was print the expected picture
        // The only problem was the backslashes, backslashes normally can't be printed by just writing them down
        // This is because backslashes are an escape character
        // In java, the way we print ONE backslash is by writting two back slashes like this: \\
        // This is why the backslashes are also highlighted in orange by VS Code

        System.out.println("   |~~~~~~~~~~~~~|");
        System.out.println("   |~~~~~~~~~~~~~|");
        System.out.println(" __|           __|");
        System.out.println("/~~\\          /~~\\");
        System.out.println("\\__/          \\__/");
    }
}
