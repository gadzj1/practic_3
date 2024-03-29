package com.mycompany.pr_3;
import java.io.File;
import java.util.Comparator;

public class FileUtils implements Comparator<File> {
    @Override
    public int compare(File file1, File file2) {
        if (file1.isDirectory() && file2.isFile()) {
            return -1;
        } else if (file1.isFile() && file2.isDirectory()) {
            return 1;
        } else {
            return file1.getName().compareTo(file2.getName());
        }
    }
}