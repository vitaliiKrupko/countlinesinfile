package service;

import java.io.*;

public class Counter {
    public static int countLines(String filename) throws FileNotFoundException {
        File myFile = new File(filename);
        FileReader fileReader = new FileReader(myFile);;
        LineNumberReader lineNumberReader = new LineNumberReader(fileReader);
        int lineNumber = 0;
        try{
            while (lineNumberReader.readLine() != null) {
                lineNumber++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                lineNumberReader.close();
            }catch (IOException e){
                e.printStackTrace();
            }
            try {
            fileReader.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        return lineNumber;
    }
}
