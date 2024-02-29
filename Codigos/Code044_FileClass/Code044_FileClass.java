package Codigos.Code044_FileClass;
import java.io.File;

public class Code044_FileClass {
    public static void main(String[] args) {
        File file = new File("Test.txt");
        

        try {
            if (file.exists()) {
                System.out.println("File exists");
            } else {
                System.out.println("File does not exist");
            }
        } catch (SecurityException e) {
            System.err.println("SecurityException: " + e.getMessage());
        }
    }
}