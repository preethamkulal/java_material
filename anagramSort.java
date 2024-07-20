import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class anagramSort {
    public static boolean isAnagram(String strA,String strB){

        if (strA.length() != strB.length()) {
            return false;
        }
        char[] str1 = strA.toCharArray();
        char[] str2 = strB.toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1,str2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String strA = sc.nextLine();
        System.out.println();
        String strB = sc.nextLine();
        if(isAnagram(strA,strB))
            System.out.println("string is Anagram");
        else
            System.out.println("string is not! Anagram");
    }
}
