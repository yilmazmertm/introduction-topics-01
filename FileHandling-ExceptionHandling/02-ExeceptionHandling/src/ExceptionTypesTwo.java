import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTypesTwo {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("nonExistingFile");
            int x = (byte)file.read();

        } catch (IOException f) {
            f.printStackTrace();
        }
    }
}
