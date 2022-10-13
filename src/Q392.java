public class Q392 {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0) return true;
        int indexS = 0;
        for(int i = 0; i < t.length(); i++){
            if(s.charAt(indexS) == t.charAt(i)) indexS++;
            if(indexS == s.length()) return true;
        }
        return false;
    }
}
