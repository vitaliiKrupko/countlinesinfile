package service;

public class Check {
    public static void checkFiles(String args[]){
        if(args == null || args.length == 0){
            System.out.println("Введіть дві назви файлів");
            System.exit(0);
        }

        if(args.length > 2){
            System.out.println("Введіть тільки дві назви файлів");
            System.exit(0);
        }
    }
}
