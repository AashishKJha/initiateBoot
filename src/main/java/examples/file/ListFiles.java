package examples.file;

import java.io.File;
import java.util.Objects;

public class ListFiles {
    public static void main(String[] args) {
        dirFinder("src");
    }

    static void dirFinder(String path) {
        try {
            File file = new File(path);

            for (File f : Objects.requireNonNull(file.listFiles())) {

                if (f.isDirectory()) {
                    System.out.println("Directory Name  : " + f.getName());
                    System.out.println("Directory Path  : " + f.getAbsolutePath());
                    dirFinder(f.getPath());
                }

                if (f.isFile()) {
                    System.out.println("File Name  : " + f.getName());
                    System.out.println("File Path  : " + f.getAbsolutePath());
                }
            }
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
