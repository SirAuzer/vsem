package tes.edu.module2;

/**
 * @author Hades
 * @version 1.0.0
 * @project vsem
 * @class MyInteger
 * @since 30.03.2021 - 21.15
 **/

public class MyInteger {
    public static boolean isPrime(int num) {
        boolean isPrime = true;
        if (num == 1) {
            isPrime = false;
            return isPrime;
        }
        else if (num == 2){
            return isPrime;
        }
        for (int i = 2; i < num; i++) {
            if(num % i == 0){
                isPrime = false;
                return isPrime;
            }
        }
        return isPrime;
    }

    public static void ShowPrimeNumber(int quantity){
        for (int num = 1, i = 1; i <= 100;num++) {
            if(isPrime(num)){
                System.out.println( i + "-prime number = " + num + " -- " + isPrime(num));
                i ++;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("first 50 prime numbers : \n");
        ShowPrimeNumber(50);

        System.out.println("----/////----");
        System.out.println("Number 47 is prime - " + isPrime( 47));
        System.out.println("Number 16 is prime - " + isPrime(16));
        System.out.println("Number 32 is prime - " + isPrime(32));
        System.out.println("Number 666 is prime - " + isPrime(666));
        System.out.println("Number 1001 is prime - " + isPrime(1001));

    }
}