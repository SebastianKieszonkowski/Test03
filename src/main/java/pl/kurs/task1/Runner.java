package pl.kurs.task1;
import java.io.File;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<JavaFileAndSize> javaFiles = new ArrayList<>();
        Services.findJavaFiles(new File("C:\\Users\\Ania\\IdeaProjects"), javaFiles);

        System.out.println("++++++++++++++++");
        System.out.println(Services.findTheBiggestJavaFile(javaFiles));
    }
}
