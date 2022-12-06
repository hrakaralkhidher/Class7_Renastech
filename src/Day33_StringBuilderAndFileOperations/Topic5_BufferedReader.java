package Day33_StringBuilderAndFileOperations;

import com.sun.xml.internal.ws.encoding.MtomCodec;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Topic5_BufferedReader {
    public static void main(String[] args) throws IOException {
//        BufferedReader MyReader = new BufferedReader();
        FileReader files = new FileReader("/Users/hrakaralkhidher/Desktop/NewFiles/file.txt");
        BufferedReader MyReader = new BufferedReader(files);

        String line = MyReader.readLine();
        System.out.println(line);
        System.out.println("**************");
        while (line != null){
            System.out.println(line);
            line = MyReader.readLine();
        }
    }
}
