package tes.edu.finalTesting;

/**
 * @author Arsenii
 * @version 1.0.0
 * @project vsem
 * @class CommonPrefix
 * @since 19.04.2021 - 20.48
 **/

public class CommonPrefix {
    public static String prefix(String[] array) {
        if(array.length == 1){
            return array[1];
        }
        String commonPrefix="";
        int count=0, k=0;

        if(array.length>0)
        {
            for(int i=0; i<array[0].length(); i++)
            {
                int j=1;
                while(j<array.length)
                {
                    if(array[0].charAt(k)==array[j].charAt(k))
                    {
                        count++;
                        j++;
                    }
                    else
                        break;
                }
                if(count==array.length-1)
                {
                    commonPrefix+=array[0].charAt(k);
                    count=0;
                    k++;
                }
                else
                {
                    return "Common Prefix: " + commonPrefix;
                }
            }
        }

        return "";
    }

    public static void main(String[] args) {
        String[] array = {"abc", "abcd", "abfce", "abcac"};

        System.out.println(prefix(array));  // ab

        String[] array2 = {"abc", "abcd", "abce", "abcac"};

        System.out.println(prefix(array2)); // abc
    }
}
