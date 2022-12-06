package Day33_StringBuilderAndFileOperations;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Topic4FileReader2 {
    public static void main(String[] args) throws IOException {
      /*
        Paths:
                 //Mac OS X: /Users/username/Desktop/foldername..../File
                //Windows: C:/Users/username/Desktop/foldername..../File
                //Linux: /home/username/Desktop/foldername..../File
         */
        //C:/Users/Hayri/Desktop/Day33/Test.txt
        try {
            FileReader files = new FileReader("/Users/hrakaralkhidher/Desktop/NewFiles/file.txt");
            System.out.println(files.read());
            int c2;
            while ((c2 = files.read()) != -1) {
                System.out.println((char) c2);
            }
             /*
            int c = MyReader.read();
            while(c != -1){
                System.out.print((char)c);
                c = MyReader.read();
            }
             */
        }catch (FileNotFoundException e){
            System.out.println("File Not found!");
        }
        catch (IOException e){
            System.out.println("Error while reading file");
        }
    }
    }

