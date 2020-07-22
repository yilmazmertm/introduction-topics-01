import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("createdByCode.txt");
            writer.write("Hello this is a string writed by the main app.");
            writer.close();
            System.out.println("Writing is finished");
        } catch (IOException exc) {
            System.out.println("An error occured");
            exc.printStackTrace();
        }
    }
}
