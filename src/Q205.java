import java.util.HashMap;
import java.util.LinkedList;

public class Q205 {
    public static boolean isIsomorphic(String s, String t) {
        int[] a1 = new int[128], a2 = new int[128];
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (a1[(s.charAt(i))] != a2[t.charAt(i)]) {
                return false;
            }
            a1[s.charAt(i)] += 1;
            a2[t.charAt(i)] += 1;
        }
        return true;
    }

    public static void main(String[] args) {
        String a = "abc";
        String b = "cdd";
        System.out.println(isIsomorphic(a, b));
    }
}
