package tes.edu.modul1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;


/**
 * @author Arsenii
 * @version 1.0.0
 * @project vsem
 * @class LaboratoryWork1
 * @since 15.03.2021 - 18.07
 **/

public class LaboratoryWork1 {
    public static void main(String[] args) throws IOException {
        String file = "C:\\Users\\Hades\\Desktop\\harry.txt";
        String textExample = new String(Files.readAllBytes(Paths.get(file)));

        String[] lines = textExample.split("\\n");// Split LINES
        int linesWithHarry = 0;
        for (int i = 0; i < lines.length; i++) {
            if (lines[i].contains("Harry")) linesWithHarry++;
        }
        System.out.println("Lines with the word \"Harry\" - " + linesWithHarry);

        textExample = textExample.replaceAll("[^A-Za-z ']", "");
        String[] words = textExample.split(" +");// Split into an array of words

        String wordWithMaxLength = "";///////1----------
        Arrays.sort(words, Comparator.comparing(String::length, Comparator.reverseOrder()));
        wordWithMaxLength = words[0].length() > wordWithMaxLength.length() ? words[0] : wordWithMaxLength;
        System.out.println("longest word - " + wordWithMaxLength);

        int wordBeginFromC = 0;///////////-----3---4
        String stringOfDistinct = "";
        for (int i = 0; i < words.length; i++) {         //Take  the array of distinct words

            if (!stringOfDistinct.contains(words[i])) {
                stringOfDistinct += words[i] + " ";
            }
            if (words[i].toLowerCase().startsWith("'c") || words[i].toLowerCase().startsWith("c")) {//How many distinct words begin from the letter "C"
                wordBeginFromC++;
            }

        }
        System.out.println("distinct words begin from the letter \"C\" -" + wordBeginFromC);
        String[] distincts = stringOfDistinct.split(" ");

        int[] arrayHashCode = new int[distincts.length]; // --5-- create an array of hashes
        for (int i = 0; i < distincts.length; i++) {
            arrayHashCode[i] = distincts[i].hashCode();
        }
        Arrays.sort(arrayHashCode);
        int intersectionsOfHashes = 0;
        for (int i = 0; i < arrayHashCode.length - 1; i++) { // 6-- intersections of hashes
            if (arrayHashCode[i] == arrayHashCode[i + 1])intersectionsOfHashes++;
        }
        System.out.println("count the intersections of hashes - " + intersectionsOfHashes);
    }
}
/*

        Lines with the word "Harry" - 1084
        longest word - interestinglooking
        distinct words begin from the letter "C" -2553
        count the intersections of hashes - 0
        */
