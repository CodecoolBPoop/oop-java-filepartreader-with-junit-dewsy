package FilePartReader;

import java.io.FileNotFoundException;

public class FileWordAnalyzer {

    public FileWordAnalyzer(FilePartReader reader) {
        try {
            System.out.println(reader.read());
        }
        catch (FileNotFoundException e1) {
            System.out.println("No file on that path found!");
        }

    }



    public static void main(String args[]) {
        FilePartReader reader = new FilePartReader();
        FileWordAnalyzer analizer = new FileWordAnalyzer(reader);
    }
}
