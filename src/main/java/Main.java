import service.Check;
import service.Counter;
import service.Save;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            Check.checkFiles(args);
            Save.saveTo(Counter.countLines(args[0]),args[1]);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не знайдено. Збережіть файл у корінь проекту");
        }
    }
}
