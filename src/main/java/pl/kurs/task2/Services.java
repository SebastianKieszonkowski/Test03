package pl.kurs.task2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;

public class Services {
    public static void findJavaFiles(File file, List<File> javaFiles) {
        File[] files = file.listFiles();

        for (File f : files) {
            if (f.isDirectory())
                findJavaFiles(f, javaFiles);
            else if (f.getName().endsWith(".java"))
                javaFiles.add(f);
        }
    }

    public static void printDayStatistic(List<File> javaFiles) {
        int[] daysOfWeekCounter = new int[7];

        for (File javaFile : javaFiles) {
            daysOfWeekCounter[getDayOfWeekFromFile(javaFile).ordinal()]++;
        }
        for (int i = 0; i < 7; i++) {
            System.out.println(DayOfWeek.values()[i] + " -> " + daysOfWeekCounter[i]);
        }
    }

    private static DayOfWeek getDayOfWeekFromFile(File file) {
        try {
            BasicFileAttributes attr = Files.readAttributes(Path.of(file.getPath()), BasicFileAttributes.class);
            FileTime fileTime = attr.creationTime();
            LocalDate ld = LocalDate.ofInstant(fileTime.toInstant(), ZoneId.of("UTC"));
            return ld.getDayOfWeek();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
