public class Q141 {

    static class ListNode {
         int val;
         ListNode next;
         ListNode(int x) {
             val = x;
             next = null;
         }
    }

    public static boolean hasCycleFSP(ListNode head) {
        if(head == null) return false;
        //declare the fast and slow pointer
        ListNode fast = new ListNode(head.val);
        ListNode slow = new ListNode(head.val);
        fast.next = head.next;
        slow.next = head.next;

        while(true){
            if(fast.next != null){
                if(fast.next.next != null){
                    fast = fast.next.next;
                }else return false;
            }else return false;
            if(slow.next != null){
                slow = slow.next;
            }else return false;
            if(fast == slow){
                return true;
            }
        }
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(4);
        ListNode n4 = new ListNode(5);
        ListNode n5 = new ListNode(7);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n1;

        System.out.println(hasCycleFSP(null));
    }
}
