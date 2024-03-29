package com.mycompany.pr_3;

import java.io.File;
import java.util.Arrays;

public class filescan {
    public void scanDirectory(String path) {
        File directory = new File(path);
        if (!directory.exists() || !directory.isDirectory()) {
            throw new IllegalArgumentException("Указанный путь не является директорией.");
        }
        
        File[] files = directory.listFiles();
        if (files != null) {
            Arrays.sort(files, new FileUtils());
            for (File file : files) {
                if (file.isDirectory()) {
                    System.out.println(file.getAbsolutePath() + " folder");
                } else {
                    System.out.println(file.getAbsolutePath() + " " + file.length() + " bytes");
                }
            }
        }
    }
}