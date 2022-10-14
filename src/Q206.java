public class Q206 {
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;
        ListNode back = new ListNode(head.val);
        head = head.next;

        while(head != null){
            ListNode front = new ListNode(head.val, back);
            back = front;
            head = head.next;
        }
        return back;
    }
}
