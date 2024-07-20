import java.util.*;

public class EncodeDecode {


        // Encodes a list of strings to a single string.
        public String encode(List<String> strs) {
            StringBuilder encoded = new StringBuilder();
            for (String str : strs){
                encoded.append(str.length()).append("#").append(str);
            }
            return encoded.toString();
        }
    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> decoded = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            int j = i;
            while (s.charAt(j) != '#') {
                
                j++;
            }
            int length = Integer.parseInt(s.substring(i, j));
            i = j + 1;
            j = i + length;
            decoded.add(s.substring(i, j));
            i = j;
        }

        return decoded;
    }
    public static void main(String[] args) {
        EncodeDecode solution = new EncodeDecode();
        List<String> original = Arrays.asList("hello", "world", "encode", "decode");
        String encoded = solution.encode(original);
        System.out.println("Encoded: " + encoded);
        List<String> decoded = solution.decode(encoded);
        System.out.println("Decoded: " + decoded);
    }
}
