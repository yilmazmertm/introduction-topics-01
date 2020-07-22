import java.io.File;
import java.io.IOException;

public class Operations {
    public static void main(String[] args) throws IOException {
        File obj = new File("createdByCode.txt");
        try {
            if (obj.createNewFile()) {
                System.out.println("New file created : " + obj.getName());
            } else {
                System.out.println("File already exist.");
            }
        } catch (IOException exc){
            System.out.println("Error Occured");
            exc.printStackTrace();
        }

        File newObj = new File("createdByCode.txt");
        if (newObj.exists()){
            System.out.println("File name: " + newObj.getName());

            System.out.println("Absolute path: " + newObj.getAbsolutePath());

            System.out.println("Writeable: " + newObj.canWrite());

            System.out.println("Readable " + newObj.canRead());

            System.out.println("File size in bytes " + newObj.length());
        } else{
            System.out.println("File does not exist.");
        }
    }
}
