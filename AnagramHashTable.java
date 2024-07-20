import java.util.Arrays;
import java.util.Scanner;

public class AnagramHashTable {
    public static boolean isAnagram(String strA,String strB){

        if (strA.length() != strB.length()) {
            return false;
        }
       int[] count = new int[26];

        for (int i = 0; i < strA.length(); i++) {
            count[strA.charAt(i) - 'a'] ++;
        }

        for (int i = 0; i < strB.length(); i++) {
            count[strB.charAt(i) - 'a'] --;

            if (count[strB.charAt(i) - 'a'] < 0)
                return false;

        }
        return true;
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
