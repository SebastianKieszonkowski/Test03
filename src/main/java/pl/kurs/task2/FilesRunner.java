package pl.kurs.task2;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FilesRunner {
    public static void main(String[] args) {
        List<File> javaFiles = new ArrayList<>();
        Services.findJavaFiles(new File("C:\\Users\\Ania\\IdeaProjects"), javaFiles);

        System.out.println("++++++++++++++++");
        Services.printDayStatistic(javaFiles);

        //MONDAY -> 69
        //TUESDAY -> 9
        //WEDNESDAY -> 71
        //THURSDAY -> 35
        //FRIDAY -> 66
        //SATURDAY -> 5
        //SUNDAY -> 22

    }
}
