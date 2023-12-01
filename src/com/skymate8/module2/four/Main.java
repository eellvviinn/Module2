package com.skymate8.module2.four;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Set<String> uWords = new HashSet<>();
        Scanner scanner = new Scanner(new File("in.txt"));
        while (scanner.hasNext()){
            String word = scanner.next().toUpperCase().replaceAll("[^a-z0-9]","");
            uWords.add(word);
        }
        scanner.close();
        System.out.println("# of unique words: " + uWords.size());
    }
}
