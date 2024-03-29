package com.mycompany.pr_3;

import java.util.Scanner;

public class Pr_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("Введите путь к каталогу для сканирования:");
            String path = scanner.nextLine();
            
            filescan fileScanner = new filescan();
            fileScanner.scanDirectory(path);
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}