import java.util.HashMap;

public class Q142 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static ListNode detectCycle(ListNode head) {
        if(head == null) return null;
        HashMap<ListNode, Integer> nodeMap= new HashMap<ListNode, Integer>();
        int index = 0;
        while(true){
            if(nodeMap.get(head) != null)return head;
            if(head.next != null){
                nodeMap.put(head, index);
                head = head.next;
                index++;
            }else return null;
        }
    }

    public static ListNode detectCycleFSP(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) break;
        }
        if(fast == null || fast.next == null) return null;
        while(slow != head){
            head = head.next;
            slow = slow.next;
        }
        return head;
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


//        System.out.println(detectCycle(null));
        System.out.println(detectCycle(n1).val);
    }
}
