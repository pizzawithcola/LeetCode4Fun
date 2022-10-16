public class Q409 {
    public int longestPalindrome(String s) {
        int[] freq = new int[128];
        for(char c : s.toCharArray()){
            freq[c] ++;
        }
        int single = 0;
        for(int i = 0; i < freq.length; i++){
            single += freq[i] & 1;
        }
        return s.length() - single + (single > 0 ? 1 : 0);
    }
}
