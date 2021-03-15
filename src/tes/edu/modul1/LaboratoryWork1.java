package tes.edu.modul1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


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
        textExample = textExample.toLowerCase().replaceAll("[^A-Za-z ']", "");

        String[] lines = textExample.split("\\n");// Split LINES
        int linesWithHarry = 0;
        for (int i = 0; i < lines.length; i++) {
            if (lines[i].contains("harry")) linesWithHarry ++;
        }
        System.out.println("Lines with the word \"Harry\" - " + linesWithHarry);

        String[] words = textExample.split(" +");// Split into an array of words
        String wordWithMaxLength = "";///////1----------
        Arrays.sort(words, Comparator.comparing(String::length, Comparator.reverseOrder()));
        wordWithMaxLength = words[0].length() > wordWithMaxLength.length() ? words[0] : wordWithMaxLength;

        System.out.println(wordWithMaxLength);


        int wordBeginFromC = 0;///////////-----3---4
        String stringOfDistictinct ="";
        for (int i = 0; i < words.length; i++){         //Take  the array of distinct words
            if (!stringOfDistictinct.contains(words[i])){
                stringOfDistictinct += (words[i].startsWith("'")) ? words[i].substring(1) + " " : words[i] + " " ;
                if (words[i].startsWith("c")) wordBeginFromC += 1;//How many distinct words begin from the letter "C"
            }
        }
        System.out.println("distinct words begin from the letter \"C\" -" + wordBeginFromC);
        String[] distincts = stringOfDistictinct.split(" ");

        int [] arrayHashCode = new int[distincts.length]; // --5-- create an array of hashes
        for (int i = 0; i < distincts.length; i++) {
            arrayHashCode[i] = distincts[i].hashCode();
        }


        Arrays.sort(arrayHashCode);
        int intersectionsOfHashes = 0;
        for (int i = 0; i < arrayHashCode.length - 2; i++) { // 6-- intersections of hashes
            intersectionsOfHashes += (arrayHashCode[i] == arrayHashCode[i+1] & arrayHashCode[i+1] != arrayHashCode[i+2] ) ? 1 : 0;
        }
        System.out.println("count the intersections of hashes - " + intersectionsOfHashes);





    }
}
