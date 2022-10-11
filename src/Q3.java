public class Q3 {
    public static int lengthOfLongestSubstring(String s) {
        int head;
        int tail;
        int max_len = 0;
        int cur_len = 0;
        String cur_str = "";

        for(int i = 0; i < s.length(); i++){
            head = i;
            tail = head;
            while(tail < s.length() && !cur_str.contains(s.substring(tail, tail + 1))){
                tail++;
                cur_str = s.substring(head, tail);
                cur_len++;
            }
            if(cur_len > max_len) max_len = cur_len;
            cur_len = 0;
            cur_str = "";
        }
        return max_len;
    }

    public static void main(String[] args) {
        String a = "a";
        System.out.println(lengthOfLongestSubstring(a));
    }
}
