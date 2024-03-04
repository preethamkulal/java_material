import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        StringBuilder sb = new StringBuilder(sc.next());
      /*  StringBuilder rev = new StringBuilder();
        char c1;
        for (int i = sb.length()-1; i>=0; i--) {
            c1 = sb.charAt(i);
            rev.append(c1);

        }
*/
        for (int i = 0; i < sb.length()/2; i++) {
            int front = i;
            int back = sb.length() -1 -i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            // reversing char
            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);

        }


        System.out.println(sb);
    }
}