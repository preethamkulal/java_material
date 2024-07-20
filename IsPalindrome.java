public class IsPalindrome {

    public boolean isPalindrome(String s){
        StringBuilder strbdr = new StringBuilder();
        for (char c : s.toCharArray()){
            if (Character.isLetterOrDigit(c)){
                strbdr.append(Character.toLowerCase(c));
            }
        }

        String orgstr = strbdr.toString();
        String revstr = strbdr.reverse().toString();
        if (orgstr.equals(revstr)){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        IsPalindrome sol = new IsPalindrome();

        String example1 = "Was it a car or a cat I saw?";
        System.out.println(sol.isPalindrome(example1)); // Output: true

        String example2 = "tab a cat";
        System.out.println(sol.isPalindrome(example2)); // Output: false
    }
}
