package tes.edu.modul1;

/**
 * @author Arsenii
 * @version 1.0.0
 * @project vsem
 * @class Palindrome
 * @since 12.03.2021 - 18.10
 **/

public class Palindrome {

    public static  boolean isPalindrome1(String text)
    {
        text = text.replaceAll("[^A-Za-zА-яа-я]", ""); //remove garbage
        text = text.toLowerCase();

        boolean result = true;

        for (int i = 0; i < text.length(); i++)
        {
            if(text.charAt(i) != text.charAt(text.length() - 1 - i))
            {
                result = false;
                break;
            }
        }
        return result;
    }

    //use stringBuilder
    public static  boolean isPalindrome2(String text)
    {
        text = text.replaceAll("[^A-Za-zА-яа-я]", "").toLowerCase();
        StringBuilder sb = new StringBuilder(text);

        return (sb.reverse().toString().equals(text));
    }

    //build a revers string
    public static  boolean isPalindrome3(String text)
    {
        text = text.replaceAll("[^A-Za-zА-яа-я]", ""); //remove garbage
        text = text.toLowerCase();
        String reversed = "";

        boolean result = true;

        for (int i = text.length() -1; i >= 0 ; i--) {
            reversed = reversed + text.charAt(i);
        }

        return reversed.equals(text);
    }
    public static void main(String[] args) {

        String text = "Я — арка края";
        System.out.println("The first way(for()): ");
        System.out.println("<<" + text + ">> is a palindrome - " + isPalindrome1(text) + "\n");

        System.out.println("The second way(stringBuilder): ");
        System.out.println("<<" + text + ">> is a palindrome - " + isPalindrome2(text) + "\n");

        System.out.println("The third way(build a revers string): ");
        System.out.println("<<" + text + ">> is a palindrome - " + isPalindrome3(text) + "\n");

    }
}

/*

        The first way(for()):
        <<Я — арка края>> is a palindrome - true

        The second way(stringBuilder):
        <<Я — арка края>> is a palindrome - true

        The third way(build a revers string):
        <<Я — арка края>> is a palindrome - true

        */
