import java.util.*;
import java.util.function.Predicate;
import java.util.stream.*;
import java.math.BigInteger;

public class IsSubsequence {

    public static void main(String [] args) {
        System.out.printf("Hello Is Subsequence Solution%n");
        if (args != null && args.length == 1 && args[0].toLowerCase().equals("-usage")) {
            System.out.printf("java IsSubsequence%n");
            return;
        }

        // sample test
        String s = "abc";
        String t = "ahgbc";

        // s is never in t
//        String s = "abc";
//        String t = "vwxyz";

        // s is bigger than t
//        String s = "abcdef";
//        String t = "abc";

        // s is same size and same value as t
//        String s = "abcdef";
//        String t = "abcdef";

        // s is same size and different value as t
//        String s = "abxdef";
//        String t = "abcdef";

        // s is null
//        String s = null;
//        String t = "abcdef";

        // t is null
//        String s = "abc";
//        String t = null;

        // s and t are null
//        String s = null;
//        String t = null;
 
        IsSubsequence find = new IsSubsequence(s, t);

        boolean result = find.solution();

        if (result) {
            System.out.printf("%nthe subsequence %s is in sequence %s%n", s, t);
        } else {
            System.out.printf("%nthe subsequence %s is not in sequence %s%n", s, t);
        }

    }

    private String s;
    private String t;

    public IsSubsequence(String s, String t) {

        this.s = s;
        this.t = t;

    }

    public boolean solution() {

        if (s == null) return false;
        if (t == null) return false;
        if (s.length() > t.length()) return false; // cannot be a subsequence if it is larger

        // Otherwise, determine if s is a subsequence of t
        int i = 0;
        int j = 0;
        boolean result = false;

        while (j < s.length() && i < t.length()) {

            if (s.charAt(j) == t.charAt(i)) {

                j++;
                i++;

            } else {

                i++;

            }

        }

        return j == s.length();

    }

}
