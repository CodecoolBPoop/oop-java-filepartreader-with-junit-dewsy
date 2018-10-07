package FilePartReader;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilePartReader {

    private String filePath;
    private int fromLine;
    private int toLine;


    public FilePartReader() {
        this.filePath = "/home/dewsy/IdeaProjects/oop-java-filepartreader-with-junit-dewsy/src/FilePartReader/text.txt";
        this.fromLine = 1;
        this.toLine = 4;
    }

    public void setuo(){
        if (this.fromLine > this.toLine) throw new IllegalArgumentException("finish must come later than start");
        if (this.fromLine < 1) throw new IllegalArgumentException("gotta start at least @ line 1");
    }


    public String read() throws FileNotFoundException {
        File file = new File(filePath);
        Scanner sc = new Scanner(file);
        sc.useDelimiter("\\Z");
        return sc.next();

    }
}
