package by.it.lomazki.dmdev.javaRushExample;

import java.io.File;

public class FileWork {

    public static void main(String[] args) {
        File folder = new File("c:\\Documents\\Java\\github\\lern.epam.com\\");
        for (File file : folder.listFiles()) {
            System.out.println(file.getName());
        }
    }
}
