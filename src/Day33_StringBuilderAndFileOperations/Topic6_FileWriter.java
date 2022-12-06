package Day33_StringBuilderAndFileOperations;

import java.io.FileWriter;
import java.io.IOException;

public class Topic6_FileWriter {
    public static void main(String[] args) throws IOException {
        FileWriter files = new FileWriter("/Users/hrakaralkhidher/Desktop/NewFiles/file.txt");
        files.write("This is an example of file writer!");
        files.write("This is the second line");
       files.close();
    }
}
