public class Q2 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() { }
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode headNode = new ListNode(0);
        ListNode cur = headNode;
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0){
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }

        return headNode.next;
    }

    public static void main(String[] args) {
        ListNode a1 = new ListNode(2);
        ListNode a2 = new ListNode(4, a1);
        ListNode a3 = new ListNode(1, a2);
        ListNode b1 = new ListNode(3);
        ListNode b2 = new ListNode(2, b1);
        ListNode result = addTwoNumbers(a3, b2);

        // print listNode a out
        while(true){
            if(result.next != null){
                System.out.print(result.val);
                result = result.next;
            }else{
                System.out.print(result.val);
                break;
            }
        }
    }
}
