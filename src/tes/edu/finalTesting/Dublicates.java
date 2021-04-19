package tes.edu.finalTesting;

import java.util.Arrays;

/**
 * @author Arsenii
 * @version 1.0.0
 * @project vsem
 * @class Dublicates
 * @since 19.04.2021 - 20.47
 **/

public class Dublicates {
    public  static  boolean hasDuplicates(int[] array){
        Arrays.sort(array);
        if(array.length <= 1)return false;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                return true;
            }
        }
        return  false;
    }

    public static void main(String[] args) {
        int[] array = {1,5,3,6,2,9,33,21};
        System.out.println(hasDuplicates(array));  // false
        array[5] = 1;
        System.out.println(hasDuplicates(array)); // true
    }
}
