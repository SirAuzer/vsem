package tes.edu.finalTesting;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Arsenii
 * @version 1.0.0
 * @project vsem
 * @class CommonPrefix
 * @since 19.04.2021 - 20.48
 **/

public class CommonPrefix {
    public static String prefix(String[] array) {
        if (array.length == 1) {
            return array[1];
        }

        String minWord = Arrays.stream(array)
                .min(Comparator.comparing(String::length)).orElse("");
        String prefix = "";
        for (int i = 0; i < array.length;){
            if(array[i].contains(minWord))
            {
                i++;
                prefix = minWord;
                continue;
            }
            else{
                minWord = minWord.substring(0, minWord.length()-1);
            }
            if(minWord.length()<=0)return null;
        }
        return "Common Prefix: " + prefix;
    }

    public static void main(String[] args) {
        String[] array = {"abc", "abcd", "abfce", "abcac"};

        System.out.println(prefix(array));  // ab

        String[] array2 = {"abc", "abcd", "abce", "abcac"};

        System.out.println(prefix(array2)); // abc
        String[] array3 = {"abc", "abcd", "a"} ;
        System.out.println(prefix(array3));
    }
}
