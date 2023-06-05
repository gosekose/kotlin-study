package ch8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CustomFileReaderPrinter {

    void readFile() throws IOException {
        File currentFile = new File(".");
        File file = new File(currentFile.getAbsolutePath() + "/a.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            System.out.println("br.readLine() = " + br.readLine());
        }
    }
}
