import java.io.File;
import java.io.IOException;
public class completeGUI {
    public static void main(String[] args) {
        try {
            File outStream = new File ("/Users/linye/Desktop/annual.csv.numbers");
            if (outStream.createNewFile()) {
                System.out.println("File created: " + outStream.getName());
            }
            else {
                System.out.println("File already exists.");
            }
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}



