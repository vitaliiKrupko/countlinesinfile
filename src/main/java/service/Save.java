package service;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Save {
    public static void saveTo(int num, String filename){
        try (PrintWriter out = new PrintWriter(filename)) {
            out.println(num);
            System.out.println("Файл збережено");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не збережено");
        }
    }
}
