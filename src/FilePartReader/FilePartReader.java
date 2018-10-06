package FilePartReader;


public class FilePartReader {

    private String filePath;
    private int fromLine;
    private int toLine;


    public FilePartReader() {
        this.filePath = "SFSDVQsdv";
        this.fromLine = -2;
        this.toLine = -3;
    }

    public void setuo(){
        if (this.fromLine > this.toLine) throw new IllegalArgumentException("finish must come later than start");
        if (this.fromLine < 1) throw new IllegalArgumentException("gotta start at least @ line 1");
    }
}
