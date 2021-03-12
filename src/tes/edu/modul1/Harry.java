package tes.edu.modul1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author Arsenii
 * @version 1.0.0
 * @project vsem
 * @class Harry
 * @since 12.03.2021 - 19.49
 **/

public class Harry {
    public static void main(String[] args) throws IOException {
        String text = new String(Files.readAllBytes(Paths.get("C:\\Users\\Hades\\Desktop\\harry.txt")));
        System.out.println(text.substring(0, 100));
        text = text.replaceAll("[^A-Za-z ']", "");

        String[] words = text.split(" +");
        System.out.println(words.length);

        for (int i = 0; i < 100; i++) {
            System.out.println(words[i]);
        }
        System.out.println("------------------------------------");

        int counter = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == 12)
            {
                System.out.println(words[i]);
                counter++;
            }
        }
        System.out.println(counter);
        System.out.println("------------------------------------");

        String stringOfDistictinct ="";

        for (int i = 0; i < words.length; i++) {
            if (!stringOfDistictinct.contains(words[i]))
            {
                stringOfDistictinct += words[i] + " ";
            }
        }
        String[] distincts = stringOfDistictinct.split(" ");

        //Arrays.sort(distincts);
        System.out.println(distincts.length);
        for (int i = 0; i < 100; i++) {
            System.out.println(distincts[i]);
        }
    }
}
