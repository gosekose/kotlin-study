package interoperability;

import java.io.IOException;
import java.util.List;

public class FileIoJava {
    public static void main(String[] args) throws Exception {

        try {
            List<String> fileStrings = FileIoExKt.loadData();
            System.out.println("fileStrings = " + fileStrings);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        FileLoader fileLoader = new FileLoader("data.txt");
        try {
            fileLoader.loadData();
        } catch (IOException e) {
            System.out.println("e = " + e);
        }
    }
}
