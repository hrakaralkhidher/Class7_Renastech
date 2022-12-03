package Day33_StringBuilderAndFileOperations;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Topic3_FileReaderIntro {
    public static void main(String[] args) {
          /*
    Paths:
                 //Mac OS X: /Users/username/Desktop/foldername..../File
                //Windows: C:/Users/username/Desktop/foldername..../File
                //Linux: /home/username/Desktop/foldername..../File
     */
        //Mac OS X: /Users/username/Desktop/foldername..../File

        try{
            FileReader MyReader = new FileReader("X: /Users/username/Desktop/Day33/Test.txt.pages");
            int c =MyReader.read();
            while(c != -1){
                System.out.println((char)c);
            }
            System.out.println((char)c);
        }catch (FileNotFoundException e){
            System.out.println("File Not found");
        }catch(IOException e2){
            System.out.println("There is a problem while reading");
        }




    }

}
