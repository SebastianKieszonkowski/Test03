package pl.kurs.task1;

import pl.kurs.task1.model.JavaFileAndSize;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Services {
    public static void findJavaFiles(File file, List<JavaFileAndSize> javaFiles) {
        File[] files = file.listFiles();

        for (File f : files) {
            if (f.isDirectory())
                findJavaFiles(f, javaFiles);
            else if (f.getName().endsWith(".java"))
                javaFiles.add(new JavaFileAndSize(f, getJavaFileSize(f)));
        }
    }

    public static JavaFileAndSize findTheBiggestJavaFile(List<JavaFileAndSize> javaFiles) {
        JavaFileAndSize theBiggestJavaFile = javaFiles.get(0);
        for (JavaFileAndSize javaFile : javaFiles) {
            theBiggestJavaFile = compareJavaFileSize(theBiggestJavaFile, javaFile);
        }
        return theBiggestJavaFile;
    }
        private static long getJavaFileSize (File file){
            try {
                return Files.size(Path.of(file.getPath()));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        private static JavaFileAndSize compareJavaFileSize (JavaFileAndSize file, JavaFileAndSize file2){
            if (file.getJavaFileSize() > file2.getJavaFileSize())
                return file;
            else
                return file2;
        }
    }
