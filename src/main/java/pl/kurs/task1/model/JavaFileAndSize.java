package pl.kurs.task1.model;

import java.io.File;

public class JavaFileAndSize {
    private File javaFile;
    private long javaFileSize;

    public JavaFileAndSize(File javaFile, long javaFileSize) {
        this.javaFile = javaFile;
        this.javaFileSize = javaFileSize;
    }

    public File getJavaFile() {
        return javaFile;
    }

    public long getJavaFileSize() {
        return javaFileSize;
    }

    @Override
    public String toString() {
        return "JavaFileAndSize{" +
                "javaFile=" + javaFile +
                ", javaFileSize=" + javaFileSize +
                " bytes}";
    }
}
