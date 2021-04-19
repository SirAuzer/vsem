package tes.edu.finalTesting;

import java.util.Arrays;

/**
 * @author Arsenii
 * @version 1.0.0
 * @project vsem
 * @class RightShift
 * @since 19.04.2021 - 20.46
 **/

public class RightShift {
    public static int[] rightShift(int[] array, int step){
        int [] mass = new int[array.length];
        int [] arrayReserv = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayReserv[i] = array[i];
        }

        for (int j = 0; j < step; j++ ) {
            for (int i = 0; i < arrayReserv.length - 1; i++) {
                mass[i + 1] = arrayReserv[i];
            }
            mass[0] = arrayReserv[array.length - 1];

            for(int point = 0; point < array.length; point++){
                arrayReserv[point] = mass[point];
            }
        }
        return arrayReserv;
    }
    public static void main(String[] args) {
        int[] array = {10, 20, 30};
        System.out.println(Arrays.toString(rightShift(array, 1))); // [30, 10, 20]

        int[] array2 = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(rightShift(array2, 2))); // [40, 50, 10, 20, 30]

        System.out.println(Arrays.toString(rightShift(array2, 21))); // [50, 10, 20, 30, 40]
    }
}
