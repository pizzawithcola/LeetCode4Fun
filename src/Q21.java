public class Q21 {
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

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Special cases
        if(list1 == null && list2 == null) return null;
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        ListNode head = new ListNode();
        ListNode curr = head;

        while(list1 != null || list2 != null){
            // one of them are null
            if(list1 == null){
                curr.next = list2;
                list2 = list2.next;
            }
            else if(list2 == null){
                curr.next = list1;
                list1 = list1.next;
            }else{
                // none of them are null
                if(list1.val < list2.val){
                    curr.next = list1;
                    list1 = list1.next;
                }
                else{
                    curr.next = list2;
                    list2 = list2.next;
                }
            }
            curr = curr.next;
        }
        return head.next;
    }
}
